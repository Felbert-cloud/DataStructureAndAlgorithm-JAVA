#!/usr/bin/env bash

set -euo pipefail

project_dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
build_dir="$project_dir/out"

mkdir -p "$build_dir"
javac -d "$build_dir" "$project_dir"/src/com/example/mypackage/*.java
java -cp "$build_dir" com.example.mypackage.Main
