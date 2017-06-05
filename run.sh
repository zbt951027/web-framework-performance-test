#!/bin/bash

app=$1

cd $1
mvn clean package

if [ "$1" == "blade2" ]; then
    java -Xmx4g -Xms4g -jar target/dist/$1-1.0-SNAPSHOT/$1-1.0-SNAPSHOT.jar
else
    java -Xmx4g -Xms4g -jar target/$1-1.0-SNAPSHOT.jar
fi