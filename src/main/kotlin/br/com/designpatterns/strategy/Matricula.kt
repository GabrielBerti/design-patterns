package br.com.designpatterns.strategy

import java.util.*

class Matricula {

    var id: Long? = null
    var inicio: Date? = null
    private val termino: Date? = null

    var aluno: Aluno? = null
    var curso: Curso? = null
    val provas: ArrayList<Prova> = ArrayList()

    var mediaStrategy: MediaStrategy? = null

    fun calcularMedia(): Double? {
        return mediaStrategy?.perform(this.provas)
    }
}