#!/bin/bash

TAG=latest
sudo docker run --name kixi.paloma -p 80:3000/tcp mastodonc/kixi.paloma:${TAG} /srv/run
