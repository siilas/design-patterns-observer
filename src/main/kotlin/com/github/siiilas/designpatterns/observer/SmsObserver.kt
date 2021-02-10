package com.github.siiilas.designpatterns.observer

class SmsObserver : Observer {

    override fun update() {
        enviaSms()
    }

    fun enviaSms() {
        println("Enviando SMS...")
    }
}
