#!/bin/bash

# This script:
# - runs all unit tests detected by maven
# - starts aplication in localmode
# - creates virtualenv for python integration tests
# - install dependenciec
# - runs integration tests
# - perform cleanup

# run unit tests
mvn test

# compile application and run in background
mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.tmc_jepp.Main" &

# setting up python's virtualenv
rm -rf ve
virtualenv -p python2 ve
source ./ve/bin/activate
# install deps
pip install -r ./integration_tests/requirements.txt

# run tests
py.test -s -v ./integration_tests

# cleanup
kill -9 $(lsof -t -i:5000)
deactivate
