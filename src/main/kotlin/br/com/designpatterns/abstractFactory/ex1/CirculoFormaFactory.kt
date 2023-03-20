package br.com.designpatterns.abstractFactory.ex1

class CirculoFormaFactory: FormaFactory() {
    override fun create(): Forma {
        return CirculoForma()
    }
}