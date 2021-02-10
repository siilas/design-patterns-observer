package com.github.siiilas.designpatterns.observer

class IntegracaoObserver : Observer {

    override fun update() {
        atualizaIntegracao()
    }

    fun atualizaIntegracao() {
        println("Atualizando integração...")
    }
}
