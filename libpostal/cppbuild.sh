#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" libpostal
    popd
    exit
fi

echo "downloading libpostal"

LIBPOSTAL_VERSION=master
download https://github.com/openvenues/libpostal/archive/$LIBPOSTAL_VERSION.tar.gz libpostal-$LIBPOSTAL_VERSION.tar.gz

echo "unpacking libpostal"

mkdir -p $PLATFORM
cd $PLATFORM
tar -xzvf ../libpostal-$LIBPOSTAL_VERSION.tar.gz
cd libpostal-$LIBPOSTAL_VERSION


case $PLATFORM in
    windows-x86_64)
    echo "Starting windows-x86_64 build"
    cp -rf windows/* ./
    echo $PWD
    autoreconf -fi --warning=no-portability
    #./configure --datadir=/c
    ./configure --disable-data-download
    make -j4
    make install
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..
