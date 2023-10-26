FROM sapmachine:17.0.8
LABEL maintainer="ShanthaKumar <kshanth@gmail.com>"

# Installig Pre-requisite
RUN  apt update \
    && apt -y install curl \
    && apt -y install git \
	&& apt -y install jq \
	&& apt -y install cron 
	
RUN curl --location --silent "https://packages.cloudfoundry.org/stable?release=linux64-binary&version=v8&source=github" | tar -zx -C /usr/local/bin

ARG MTA_PLUGIN_VERSION=3.0.3
ARG MTA_PLUGIN_URL=https://github.com/cloudfoundry-incubator/multiapps-cli-plugin/releases/download/v${MTA_PLUGIN_VERSION}/multiapps-plugin.linux64
ARG CSPUSH_PLUGIN_VERSION=1.3.2
ARG CSPUSH_PLUGIN_URL=https://github.com/dawu415/CF-CLI-Create-Service-Push-Plugin/releases/download/${CSPUSH_PLUGIN_VERSION}/CreateServicePushPlugin.linux64

RUN cf add-plugin-repo CF-Community https://plugins.cloudfoundry.org && \
    cf install-plugin blue-green-deploy -f -r CF-Community && \
    cf install-plugin ${MTA_PLUGIN_URL} -f && \
    cf install-plugin ${CSPUSH_PLUGIN_URL} -f && \
    cf install-plugin -r CF-Community "html5-plugin" -f && \
    cf plugins
RUN curl -sL https://aka.ms/InstallAzureCLIDeb | bash
RUN curl -LO https://dl.k8s.io/release/v1.24.0/bin/linux/amd64/kubectl && install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
RUN curl -fsSL -o get_helm.sh https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 \
    && chmod +x get_helm.sh && ./get_helm.sh
RUN set -x; cd "$(mktemp -d)" && \
  OS="$(uname | tr '[:upper:]' '[:lower:]')" && \
  ARCH="$(uname -m | sed -e 's/x86_64/amd64/' -e 's/\(arm\)\(64\)\?.*/\1\2/' -e 's/aarch64$/arm64/')" && \
  KREW="krew-${OS}_${ARCH}" && \
  curl -fsSLO "https://github.com/kubernetes-sigs/krew/releases/latest/download/${KREW}.tar.gz" && \
  tar zxvf "${KREW}.tar.gz" && \
  ./"${KREW}" install krew && \
  cp $HOME/.krew/bin/kubectl-krew /usr/local/bin/
RUN kubectl krew install oidc-login
RUN apt-get --assume-yes install software-properties-common
RUN curl -fsSL https://apt.releases.hashicorp.com/gpg | apt-key add -
RUN apt-add-repository "deb [arch=amd64] https://apt.releases.hashicorp.com $(lsb_release -cs) main"
RUN apt -y install terraform
ENV PATH ${KREW_ROOT:-$HOME/.krew}/bin:$PATH
CMD ["echo", "Image created"] 