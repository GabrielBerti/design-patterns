package br.com.designpatterns.abstractFactory.ex1

class DesenhistaFachada {
    fun desenhar(tipo: String) {
        val forma = FormaFactory.getForma(tipo)
        forma.desenhar()
    }
}