package com.cb.myapplication.examples

abstract class Device {
    fun onStarted() {
        peek()
        println("onStarted")
    }

    abstract fun peek()
}