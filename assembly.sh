#!/usr/bin/env bash
WORKING_DIR="$(cd $(dirname $0); pwd -P)"
rm -rf dist
mkdir dist
cp ${WORKING_DIR}/${MAIN_PROJECT}/appspec.yml dist/
cp ${WORKING_DIR}/${MAIN_PROJECT}/start.sh.etpl dist/
cp ${WORKING_DIR}/${MAIN_PROJECT}/validate.sh.etpl dist/
unzip -d dist/ ${WORKING_DIR}/${MAIN_PROJECT}/target/${APP}.zip