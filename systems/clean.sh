#!/bin/bash

# Directory where the folders are located
parent_directory=$1

# Loop through all directories in the parent directory
for dir in "$parent_directory"/*/; do
  if [ -d "$dir" ]; then
    echo "Running script in $dir"
    cd "$dir"  # Change to the directory
    mvn clean  # Run your script (make sure the script is executable)
    cd ..  # Go back to the parent directory
  fi
done
