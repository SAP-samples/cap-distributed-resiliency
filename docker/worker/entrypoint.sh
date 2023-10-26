#!/bin/bash
set -e
freeMem=`awk '/MemFree/ { print int($2/1024) }' /proc/meminfo`
s=$(($freeMem/10*8))
x=$(($freeMem/10*8))
n=$(($freeMem/10*2))

echo $(java -version)
echo "IP Address: $(hostname -I)"

echo "JMeter Worker started on `date`"
jmeter-server -Djava.rmi.server.hostname=$(hostname -I) -Dserver.rmi.localport=50000 -Dserver_port=1099 -Jserver.rmi.ssl.disable=true