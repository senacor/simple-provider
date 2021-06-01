#!/bin/bash

mkdir -p ./rendered/

for file in ./deployment/*.y*ml
do
  dest="./rendered/$(basename "$file")"
  envsubst < "$file" > "$dest"
done
