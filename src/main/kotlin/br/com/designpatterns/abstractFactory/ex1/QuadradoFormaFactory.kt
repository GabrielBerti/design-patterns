package br.com.designpatterns.abstractFactory.ex1


class QuadradoFormaFactory: FormaFactory() {
    override fun create(): Forma {
        return QuadradoForma()
    }
}