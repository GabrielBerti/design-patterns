package br.com.designpatterns.templateMethod

fun main(args: Array<String>) {
    println(MensagemEspecial().completa(8))
    println(MensagemNormal().completa(2))
}