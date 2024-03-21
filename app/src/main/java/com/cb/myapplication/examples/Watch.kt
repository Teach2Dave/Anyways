package com.cb.myapplication.examples

open class Watch {
    var model: String = ""
    var price: Float = 0f

    open fun giveTheHour() {
        println("${model}: giveTheHour")
    }
}