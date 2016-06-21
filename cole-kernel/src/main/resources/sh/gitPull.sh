#!/usr/bin/env bash
SCRIPTS_DIR=`dirname "$0"`
PROJECT_DIR=`cd $SCRIPTS_DIR && pwd`
if [ -n $1 ]
then
PROJECT_DIR=$1;
  cd $1;
fi
if [ -n $2 ]
then
PROJECT_DIR="$PROJECT_DIR/$2"
  rm -rf $PROJECT_DIR
  mkdir $PROJECT_DIR
  cd $PROJECT_DIR;
fi
if [ -n $3 ]
then
echo $3
    git clone -b $2 "$3" .
fi