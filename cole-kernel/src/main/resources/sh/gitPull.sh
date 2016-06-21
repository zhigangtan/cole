#!/usr/bin/env bash
SCRIPTS_DIR=`dirname "$0"`
PROJECT_DIR=`cd $SCRIPTS_DIR && pwd`
if [ -n $1 ]
then
PROJECT_DIR="$PROJECT_DIR/$1"
  rm -rf $PROJECT_DIR
  mkdir $PROJECT_DIR
  cd $PROJECT_DIR;
fi
if [ -n $2 ]
then
echo $2
    git clone -b $1 $2 .
fi