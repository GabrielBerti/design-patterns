package br.com.designpatterns.observer

class SensorDeFechamentoDeComporta: SensorDeComporta() {
    var nivelDeFechamentoEmMetros: Double? = null

    override fun update() {
        super.update()
            if ((this.nivelDeFechamentoEmMetros ?: 0.0) >= (super.nivelAtualEmMetros ?: 0.0)) {
                println("Fechando a comporta...")
        }
    }
}