package com.cb.myapplication.examples

class SmartWatch : Watch() {
    var OS: String = ""

    fun giveTheHourCuzSmartWatch() {
        println("${model}: giveTheHourCuzSmartWatch")
    }

    fun daddyGiveMeTheHourPlease() {
        super.giveTheHour()
    }

    override fun giveTheHour() {
        println("The hours its today")
    }

    override fun peek() {
        println("$model peek do not apply here")
    }
}