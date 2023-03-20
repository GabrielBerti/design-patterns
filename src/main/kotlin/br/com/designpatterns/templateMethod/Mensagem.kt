package br.com.designpatterns.templateMethod

abstract class Mensagem {
    fun completa(pontos: Int): String {
        val parte = this.parte(pontos)
        return "Vc fez $pontos pontos. Seu resultado é... $parte"
    }

    protected abstract fun parte(pontos: Int): String
}