#!/bin/bash
cat >> ./$1-prop.file <<EOF
name=$1
operation=$2
tech=$3
trigger=$4
