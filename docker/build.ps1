cd  controller
docker stop ghcr.io/kshanth/jmeter_controller
docker rm ghcr.io/kshanth/jmeter_controller
docker rmi ghcr.io/kshanth/jmeter_controller:latest
docker build -t ghcr.io/kshanth/jmeter_controller:latest  -f Dockerfile . --no-cache
docker push ghcr.io/kshanth/jmeter_controller:latest 

cd ..\worker
 
docker stop ghcr.io/kshanth/jmeter_worker
docker rm ghcr.io/kshanth/jmeter_worker
docker rmi ghcr.io/kshanth/jmeter_worker:latest
docker build -t ghcr.io/kshanth/jmeter_worker:latest  -f Dockerfile . --no-cache


docker push ghcr.io/kshanth/jmeter_worker:latest 
cd ..