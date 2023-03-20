package br.com.designpatterns.strategy

class Aluno {
    var id: Long? = null
    var ra: String? = null
    var nome: String? = null

    val matriculas: ArrayList<Matricula> = ArrayList()
}