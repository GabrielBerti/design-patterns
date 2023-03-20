package br.com.designpatterns.strategy

class EscolaFachada {

    private var cursos: MutableMap<Long, Curso> = HashMap()
    private var alunos: MutableMap<Long, Aluno> = HashMap()
    private var matriculas: MutableMap<Long, Matricula> = HashMap()
    private var provas: MutableMap<Long, Prova> = HashMap()
    fun mockEscola() {
        val c1 = Curso()
        c1.id = 1L
        c1.nome = "Qualidade de Código"
        c1.descricao = "Aprenda a melhorar a qualidade do seu código."

        val a1 = Aluno()
        a1.id = 1L
        a1.ra = "RA01"
        a1.nome = "João Silva"

        val m1 = Matricula()
        m1.id = 1L
        m1.inicio = java.util.Date()

        m1.aluno = a1
        m1.curso = c1
        a1.matriculas.add(m1)
        c1.matriculas.add(m1)

        val p1 = Prova()
        p1.id = 1L
        p1.nota = 7.0
        p1.matricula = m1
        m1.provas.add(p1)

        val p2 = Prova()
        p2.id = 2L
        p2.nota = 4.5
        p2.matricula = m1
        m1.provas.add(p2)

        val p3 = Prova()
        p3.id = 3L
        p3.nota = 9.5
        p3.matricula = m1
        m1.provas.add(p3)

        cursos[c1.id!!] = c1
        alunos[a1.id!!] = a1
        matriculas[m1.id!!] = m1
        provas[p1.id!!] = p1
        provas[p2.id!!] = p2
        provas[p3.id!!] = p3
    }

    fun calcularMedia(_idMatricula: Long, _tipoMedia: String): Double? {

        val matricula = matriculas[_idMatricula]
        if ("aritmetica" == _tipoMedia) {
            matricula?.mediaStrategy = MediaAritmeticaStrategy()
        } else {
            matricula?.mediaStrategy = MediaPonderadaStrategy()
        }
        return matricula?.calcularMedia()
    }

}