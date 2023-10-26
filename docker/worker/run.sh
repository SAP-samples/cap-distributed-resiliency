# docker network create --subnet=172.18.0.0/16 mynet123
# docker run --net mynet123 --ip 172.18.0.22 -it ubuntu bash
docker stop ghcr.io/kshanth/jmeter_worker
docker rm jw
docker run --name jw jw:1