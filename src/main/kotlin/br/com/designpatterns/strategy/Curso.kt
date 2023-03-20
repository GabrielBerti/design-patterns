package br.com.designpatterns.strategy

class Curso {
    var id: Long? = null
    var nome: String? = null
    var descricao: String? = null
    val matriculas: ArrayList<Matricula> = ArrayList()
}