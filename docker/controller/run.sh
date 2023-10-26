#!/bin/bash
while getopts "b:r:c:" flag
do
    case "${flag}" in
        b) branch=${OPTARG};;
        r) repo=${OPTARG};;
        c) config=${OPTARG};;
    esac
done
echo "Execution started..."
workdir="performance_test"
if [ ! -z "$branch" ] && [ ! -z "$repo" ]
then
    rm -rf $workdir
    echo "Cloning latest test configurations.."
    git clone -b ${branch} ${repo} $workdir
fi
cd $workdir/jmeter

if [ -z "$config" ]
then
    echo "Unable to proceed due to an empty config parameter"
    exit 1
fi

if [ ! -f "$config" ] 
then
    echo "The config file [$config] does not exist"
    exit 1
fi

ExecutionDate=$(date +"%Y-%m-%dT%H:%M:%SZ")
ExecutionDateFolder=$(echo $ExecutionDate | sed "s/:/-/g")

GlobalConfigFile=$config
GlobalConfigJson="$(jq '.' $GlobalConfigFile)"
InfluxDbUrl="$(jq -r '.DBConfig.Url' <<< $GlobalConfigJson)"
InfluxDbToken="$(jq -r '.DBConfig.Token' <<< $GlobalConfigJson)"
InfluxDbOrg="$(jq -r '.DBConfig.Organization' <<< $GlobalConfigJson)"
InfluxDbBucket="$(jq -r '.DBConfig.Bucket' <<< $GlobalConfigJson)" 
ScenarioConfigFolders="$(jq -r '.ScenarioConfigFolders' <<< $GlobalConfigJson)" 

if [[ $ScenarioConfigFolders == *,* ]]; then 
  #$ScenarioConfigFolders = $GlobalConfigFlatJson.ScenarioConfigFolders.Split(",")
  IFS=', ' read -r -a ScenarioConfigFolders <<< $ScenarioConfigFolders
fi

function RunTest() {
    for ConfigFolder in "${ScenarioConfigFolders[@]}"
    do
        ScenarioConfigFolder=$( echo ${GlobalConfigFile%/*} )
        ScenarioConfigFolder="$ScenarioConfigFolder/$ConfigFolder"
        JmxFolder="$ScenarioConfigFolder/jmx"
        JmxFiles=($JmxFolder/*.jmx)
        JmxFile=${JmxFiles[0]}
        ConfigFiles=($ScenarioConfigFolder/*.json)
        for ConfigFile in "${ConfigFiles[@]}"
        do
            MergedConfigJson=$(jq -s '.[0] * .[1]' ${GlobalConfigFile} ${ConfigFile})
            MergedConfigJson=$(jq --arg value "$ExecutionDate" '.ExecutionDate = $value' <<< $MergedConfigJson)
            MergedConfigJson=$(jq --arg value "$2" '.WorkerHosts = $value' <<< $MergedConfigJson)
            MergedConfigFlatJson="$(jq --arg delim '_' 'reduce (tostream|select(length==2)) as $i ({};.[[$i[0][]|tostring]|join($delim)] = $i[1])' <<< ${MergedConfigJson})"           
            echo "============================================================="
            #jq -r 'to_entries[]|"\(.key)=\(.value)"' <<< $MergedConfigFlatJson
#            echo "$MergedConfigFlatJson"
            Scenario="$(jq -r '.Scenario' <<< $MergedConfigFlatJson)"
            ConnectionType="$(jq -r '.ConnectionType' <<< $MergedConfigFlatJson)"

            BTPHostName="$(jq -r '.BTPHost_Name' <<< $MergedConfigFlatJson)"
            BTPHostIP="$(jq -r '.BTPHost_IPAddress' <<< $MergedConfigFlatJson)"
            S4HHostName="$(jq -r '.S4HHost_Name' <<< $MergedConfigFlatJson)"
            S4HHostIP="$(jq -r '.S4HHost_IPAddress' <<< $MergedConfigFlatJson)"
            SCCHostName="$(jq -r '.SCCHost_Name' <<< $MergedConfigFlatJson)"
            SCCHostIP="$(jq -r '.SCCHost_IPAddress' <<< $MergedConfigFlatJson)"
            UserHostName=$3
            TestCase=$Scenario-$S4HHostName-$ConnectionType-$BTPHostName-$UserHostName
            ResultsPath=results/${ExecutionDateFolder}/$TestCase
            ResultsFile=$ResultsPath/JMeterResults.csv
            mkdir -p $ResultsPath
            PropertiesFile=$ResultsPath/Parameter.properties
            (jq -r 'to_entries[]|"\(.key)=\(.value)"' <<< $MergedConfigFlatJson) > $PropertiesFile

            echo "------------------------------ JMeter execution started ------------------------------"  
            echo "Scenario: $Scenario" 
            echo "Connection Type: $ConnectionType"
            echo "Test Case: $TestCase" 
            echo "Results are stored in: $ResultsFile" 
            echo ""
            
            /opt/apache-jmeter-5.5/bin/jmeter -n -t $JmxFile -l $ResultsFile -q "$ResultsPath/Parameter.properties" -G"$ResultsPath/Parameter.properties" -R $1
            echo "------------------------------ JMeter execution completed ------------------------------"

            echo ""
            echo "Moving JMeter logs..."
            mv jmeter.log $ResultsPath
            echo "------------------------------ Results upload started ------------------------------"
            echo "Uploading result file: $ResultsFile"
            /usr/bin/java -jar ../../result-uploader.jar -c $ResultsFile -p "$ResultsPath/Parameter.properties" -dt $ExecutionDate
            echo "------------------------------ Results upload completed ------------------------------"
        done
    done
}

function InitTest {
    WorkerHosts="$(jq -r '.JMeterWorker.Hosts' <<< $GlobalConfigJson)"  
    ExecutionType="$(jq -r '.JMeterWorker.ExecutionType' <<< $GlobalConfigJson)"
    if [[ $ExecutionType == parallel ]]; then 
        WorkerHostIps=""
        WorkerHostIpNames=""
        WorkerHosts=$(jq -c -r '.[]' <<< $WorkerHosts)
        while read WorkerHost; do 
            WorkerHostIp=$(jq -r '.IPAddress' <<< "$WorkerHost")  
            WorkerHostName=$(jq -r '.Name' <<< "$WorkerHost")     
            WorkerHostIpNames+=$WorkerHostIp=$WorkerHostName,
            WorkerHostIps+=${WorkerHostIp},
        done <<< $WorkerHosts
        WorkerHostIpNames="${WorkerHostIpNames%?}" 
        WorkerHostIps="${WorkerHostIps%?}" 
        RunTest $WorkerHostIps $WorkerHostIpNames "all"
    else
        jq -c -r '.[]' <<< $WorkerHosts | while read item; do 
            WorkerHostIp=$(jq -r '.IPAddress' <<< "$item")  
            WorkerHostName=$(jq -r '.Name' <<< "$item")     
            WorkerHostIpName=$WorkerHostIp=$WorkerHostName
            echo "$WorkerHostIp" 
            RunTest $WorkerHostIp $WorkerHostIpName $WorkerHostName
        done
    fi
}

DurationInHours="$(jq -r '.DurationInHours' <<< $GlobalConfigJson)" 
if [[ $DurationInHours != null ]]
then
    ExecutionEndTime=$(date -ud "$DurationInHours minutes" +%s)
    while [[ $(date -u +%s) -le "$ExecutionEndTime" ]] 
    do
         InitTest
         SleepInSeconds="$(jq -r '.SleepInSeconds' <<< $GlobalConfigJson)" 
         if [[ $SleepInSeconds != null ]] 
         then 
            sleep $SleepInSeconds
            ExecutionDate=$(date +"%Y-%m-%dT%H:%M:%SZ")
            ExecutionDateFolder=$(echo $ExecutionDate | sed "s/:/-/g")
        fi
    done
    
else
    InitTest  
    echo "============================= Testing completed =============================="
fi