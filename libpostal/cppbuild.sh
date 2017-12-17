#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" libpostal
    popd
    exit
fi

mkdir -p $PLATFORM

cd $PLATFORM

mkdir -p libpostal

cd libpostal

case $PLATFORM in
    windows-x86_64)
    ECHO $PWD
        unzip ../../../src/main/resources/libpostal.zip
        mkdir -p ../bin
        mkdir -p ../include
        cp *.dll ../bin
        cp *.h ../include
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..


