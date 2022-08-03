#!/bin/bash
#Starting the loop
for a in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
do
    #When the loop gets 8, hang on 5 secs
    if [ $a == 8 ]
    then
    	sleep 5
        echo "Get some rest from the class, $name"
    fi
    echo "Class number $a"
done
sleep 5
echo "$name, we are done with $curso course, taught in $language, See you soon!!"
