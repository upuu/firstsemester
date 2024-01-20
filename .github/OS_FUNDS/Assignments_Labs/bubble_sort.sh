#!/bin/bash

# assignment 10: linux shell scripting 3
# for CST8102
# Rowan Pilon 041049454
# due December 4, 2023
# script file aten.sh takes an array through a loop
# and sorts in order of least to greatest

declare -a bubblearray

bubblearray=()

while read -r -p "Next item (end with an empty line): " line; do
    [[ $line ]] || break  # break if line is empty
    bubblearray+=("$line")
done

len=${#bubblearray[@]}-1  # length variable to use in loop, 1 is subtracted to compensate for how you seek through arrays

holder="" #holder variable to swap two array values

for (( i=0; i<=$len; i++)) # main loop
do
        if [[ ${bubblearray[i]} -gt ${bubblearray[i+1]} ]] #compares two values beside eachother in the array
        then
            holder=${bubblearray[i]}
            bubblearray[i]=${bubblearray[i+1]}  # and then swaps them if needed.
            bubblearray[i+1]=$holder
        fi
echo ${bubblearray[*]} # prints array after every cycle of the loop
done


