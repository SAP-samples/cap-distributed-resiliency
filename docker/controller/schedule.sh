while getopts "b:r:c:" flag
do
    case "${flag}" in
        b) branch=${OPTARG};;
        r) repo=${OPTARG};;
        c) config=${OPTARG};;
    esac
done

workdir="performance_test"
rm -rf $workdir
git clone -b ${branch} ${repo} $workdir
configFile=$workdir/jmeter/$config

echo "Configuring scheduler"
crontab -r
touch /var/spool/cron/crontabs/root
touch /var/log/cron.log

while read -r line; do
      (crontab -l; echo "$line")|awk '!x[$0]++'|crontab -
 done < $configFile
service cron start