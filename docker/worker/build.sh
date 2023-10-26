docker stop ghcr.io/kshanth/jmeter_worker
docker rm ghcr.io/kshanth/jmeter_worker
docker rmi ghcr.io/kshanth/jmeter_worker:latest
docker build -t ghcr.io/kshanth/jmeter_worker:latest  -f Dockerfile . --no-cache

if [ "$1" = "push" ] 
then
    docker push ghcr.io/kshanth/jmeter_worker:latest 
fi