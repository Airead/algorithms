#!/bin/sh

curPath="`dirname \"$0\"`"
absPath="`pwd`/$curPath"

classPath=$absPath/lib/algs4.jar:$absPath/out/production/algorithms

export CLASSPATH=$classPath
echo $CLASSPATH