#!/usr/bin/env bash

mvn clean install -DskipTests

cd ./user/java/rxjava-apis-user-client/
./install.sh
cd ../../../

cd ./user/java/rxjava-apis-user-dashboard/
./install.sh
cd ../../../

cd ./user/java/rxjava-apis-user-serve/
./install.sh
cd ../../../