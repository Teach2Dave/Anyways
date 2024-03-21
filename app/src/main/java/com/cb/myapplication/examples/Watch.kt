package com.cb.myapplication.examples

open class Watch : Device() {
    var model: String = ""
    var price: Float = 0f

    open fun giveTheHour() {
        println("${model}: giveTheHour")
    }

    override fun peek() {
        println("$model peek on watch")
    }
}