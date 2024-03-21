package com.cb.myapplication

// Class, Interface, Instance, Hirentence (extends), Polimosfirm
// Class, Abstract Class

// class Watch -> Kotlin, Java

open class Watch {
    var model: String = ""
    var price: Float = 0f

    open fun giveTheHour() {
        println("${model}: giveTheHour")
    }
}

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
}

fun main() {
    val myWatch = Watch()
    myWatch.model = "Casio"
    //myWatch.giveTheHour()


    val mySmartWatch = SmartWatch()
    mySmartWatch.model = "Xiaomi"
    //mySmartWatch.giveTheHour()

    val listOfWatch = listOf<Watch>(myWatch, mySmartWatch)

    listOfWatch.forEach { watch ->
        if (watch is SmartWatch) {
            watch.daddyGiveMeTheHourPlease()
        }
        watch.giveTheHour()
    }

    // mySmartWatch.daddyGiveMeTheHourPlease()
    // mySmartWatch.giveTheHourCuzSmartWatch()

}





