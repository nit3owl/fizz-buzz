#!/bin/bash

for i in {1..100};
do
    result=""
    if [ $[$i % 3 ] == 0 ]; then result=Fizz; fi
    if [ $[$i % 5 ] == 0 ]; then result=${result}Buzz; fi
    if [ "$result" == "" ]; then echo $i; else echo $result; fi
done
