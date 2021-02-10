package com.github.siiilas.designpatterns.observer

class UsuarioSubject : Subject {

    private val observers: MutableList<Observer> = mutableListOf()

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update() }
    }

    fun atualizaUsuario() {
        println("Atualizando usuário...")
        notifyObservers()
    }
}
