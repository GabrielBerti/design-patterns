package br.com.designpatterns.strategy

fun main(args: Array<String>) {
    val escolaFachada = EscolaFachada()
    escolaFachada.mockEscola()
    println("Média: " + escolaFachada.calcularMedia(1L, "aritmetica"))
}