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
	&& mkdir -p /tmp/dependencies  \
	&& curl -L --silent ${JMETER_DOWNLOAD_URL} --output /tmp/dependencies/apache-jmeter-${JMETER_VERSION}.tgz \
	&& mkdir -p /opt  \
	&& tar -xzf /tmp/dependencies/apache-jmeter-${JMETER_VERSION}.tgz -C /opt  \
    && rm -rf /tmp/dependencies \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/docs/ \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/printable_docs/ \
	&& rm -rf /opt/apache-jmeter-${JMETER_VERSION}/licenses/    

# Ports to be exposed from the container
EXPOSE 1099 50000
COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh 
ENV PATH $PATH:$JMETER_BIN
WORKDIR	${JMETER_HOME}
ENTRYPOINT ["/entrypoint.sh"]