package br.com.designpatterns.singleton

import br.com.designpatterns.abstractFactory.ex1.DesenhistaFachada

fun main(args: Array<String>) {
    val singleton = Singleton.getInstance()
    println(singleton.toString())
}