package br.com.designpatterns.abstractFactory.ex1

class CirculoForma : Forma {
    override fun desenhar() {
        return println("Desenhando circulo")
    }
}