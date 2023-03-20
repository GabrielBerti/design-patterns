package br.com.designpatterns.abstractFactory.ex1

import br.com.designpatterns.abstractFactory.ex1.DesenhistaFachada

fun main(args: Array<String>) {
    val desenhista = DesenhistaFachada()
    desenhista.desenhar("circulo")
}