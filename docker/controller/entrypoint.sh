#!/bin/bash
echo $(java -version)

if [ ! -z "$branch" ] && [ ! -z "$repo" ] && [ ! -z "$config" ]
then
    workdir="performance_test"
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
fi
tail -f /dev/null
