package br.com.designpatterns.abstractFactory.ex1

class QuadradoForma : Forma {
    override fun desenhar() {
        return println("Desenhando quadrado")
    }
}