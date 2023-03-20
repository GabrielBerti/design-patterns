package br.com.designpatterns.abstractFactory.ex1

abstract class FormaFactory {
    abstract fun create(): Forma
    companion object {
        fun getForma(tipo: String): Forma {
            return if("circulo" == tipo) {
                CirculoFormaFactory().create()
            } else {
                QuadradoFormaFactory().create()
            }
        }
    }
}