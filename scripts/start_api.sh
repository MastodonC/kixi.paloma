#!/bin/bash
# Usage: ./start_api.sh [dockerhub tag] [port]

TAG=$1
PORT=$2

sudo docker run --name kixi.paloma -d -i -t -p ${PORT}:3000/tcp mastodonc/kixi.paloma:${TAG} /srv/run
