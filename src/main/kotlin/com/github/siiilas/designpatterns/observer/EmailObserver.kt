package com.github.siiilas.designpatterns.observer

class EmailObserver : Observer {

    override fun update() {
        enviaEmail()
    }

    fun enviaEmail() {
        println("Enviando e-mail...")
    }
}
