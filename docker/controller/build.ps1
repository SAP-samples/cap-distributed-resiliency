docker stop ghcr.io/kshanth/jmeter_controller
docker rm ghcr.io/kshanth/jmeter_controller
docker rmi ghcr.io/kshanth/jmeter_controller:latest
docker build -t ghcr.io/kshanth/jmeter_controller:latest  -f Dockerfile . --no-cache
docker push ghcr.io/kshanth/jmeter_controller:latest 