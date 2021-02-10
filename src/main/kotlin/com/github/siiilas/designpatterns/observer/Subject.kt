package com.github.siiilas.designpatterns.observer

interface Subject {

    fun attach(observer: Observer);

    fun detach(observer: Observer);

    fun notifyObservers();
}
