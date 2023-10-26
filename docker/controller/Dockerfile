FROM sapmachine:17.0.8
LABEL maintainer="ShanthaKumar <kshanth@gmail.com>"

ARG JMETER_VERSION="5.5"

ENV JMETER_HOME /opt/apache-jmeter-${JMETER_VERSION}
ENV JMETER_BIN  ${JMETER_HOME}/bin
ENV MIRROR_HOST https://archive.apache.org/dist/jmeter
ENV JMETER_DOWNLOAD_URL ${MIRROR_HOST}/binaries/apache-jmeter-${JMETER_VERSION}.tgz

# Installig Pre-requisite
RUN  apt update \
    && apt -y install curl \
    && apt -y install git \
	&& apt -y install jq \
	&& apt -y install cron \
	&& mkdir -p /tmp/dependencies  \
	&& curl -L --silent ${JMETER_DOWNLOAD_URL} --output /tmp/dependencies/apache-jmeter-${JMETER_VERSION}.tgz \
	&& mkdir -p /opt  \
	&& tar -xzf /tmp/dependencies/apache-jmeter-${JMETER_VERSION}.tgz -C /opt  \
	# && curl -L --silent https://packages.microsoft.com/config/ubuntu/22.04/packages-microsoft-prod.deb --output /tmp/dependencies/packages-microsoft-prod.deb \
	# && dpkg -i /tmp/dependencies/packages-microsoft-prod.deb \
	# && apt-get update \
	# && apt-get install -y powershell \
	# && apt-get install -y cron \
    && rm -rf /tmp/dependencies \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/docs/ \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/printable_docs/ \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/licenses/   
EXPOSE 60000

# Disable ssl
RUN sed -i "s/#server.rmi.ssl.disable=false/server.rmi.ssl.disable=true/" $JMETER_BIN/jmeter.properties
RUN cat $JMETER_BIN/jmeter.properties

COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh 
COPY run.sh /
RUN chmod +x /run.sh 
COPY schedule.sh /
RUN chmod +x /schedule.sh 

COPY result-uploader.jar /

ENV PATH $PATH:$JMETER_BIN
WORKDIR	/
ENTRYPOINT ["/entrypoint.sh"]