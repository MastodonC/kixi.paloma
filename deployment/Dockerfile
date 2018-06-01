FROM zittix/docker-baseimage-java8
MAINTAINER Jason Bell <jason@mastodonc.com>

CMD ["/sbin/my_init"]

RUN apt-get update \
&&  apt-get -y install software-properties-common

ENV JAR_LOCATION=/srv/server.jar
ENV CONFIG_PROFILE=${environment}

ADD target/server.jar /srv/server.jar
ADD scripts/run.sh /srv/run

EXPOSE 3000/tcp

RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*
