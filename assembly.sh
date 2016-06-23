#!/usr/bin/env bash
WORKING_DIR="$(cd $(dirname $0); pwd -P)"
rm -rf dist
mkdir dist
cp ${WORKING_DIR}/start.sh dist/
cp ${WORKING_DIR}/cole-web/target/cole-web-*.jar dist/