package com.cb.myapplication.examples

fun main() {

    val myWatch = Watch()
    myWatch.model = "Casio"
    //myWatch.giveTheHour()


    val mySmartWatch = SmartWatch()
    mySmartWatch.model = "Xiaomi"
    //mySmartWatch.giveTheHour()

    val listOfWatch = listOf<Watch>(myWatch, mySmartWatch)

    listOfWatch.forEach { watch ->
        watch.onStarted()
    }

    // mySmartWatch.daddyGiveMeTheHourPlease()
    // mySmartWatch.giveTheHourCuzSmartWatch()

}