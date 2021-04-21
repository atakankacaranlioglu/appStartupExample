#!/bin/sh

summary=0
totalTime=0
loopCount=10

for i in $(seq 1 $loopCount)
do

adb shell am force-stop com.akacaran.startupexample
sleep 1

totalTime=$(adb shell am start -W -n com.akacaran.startupexample/com.akacaran.startupexample.MainActivity | grep "TotalTime" | cut -d ' ' -f 2)

echo "Startup $i : $totalTime ms"
summary=$((summary + totalTime))

done

echo Avarage $((summary / loopCount))
