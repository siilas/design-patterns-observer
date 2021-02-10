package com.github.siiilas.designpatterns.observer

class Main

fun main(args: Array<String>) {
    val email = EmailObserver()
    val sms = SmsObserver()
    val integracao = IntegracaoObserver()

    val usuario = UsuarioSubject()
    usuario.attach(email)
    usuario.attach(sms)
    usuario.attach(integracao)

    usuario.atualizaUsuario()

    println("\n\nRemovendo integração observer...\n\n")
    usuario.detach(integracao)

    usuario.atualizaUsuario()
}