package br.com.designpatterns.observer

class SensorDeAberturaDeComporta : SensorDeComporta() {
    var nivelDeAberturaEmMetros: Double? = null

    override fun update() {
        super.update()
        if ((this.nivelDeAberturaEmMetros ?: 0.0) <= (super.nivelAtualEmMetros ?: 0.0)) {
            println("Abrindo a comporta...")
        }
    }
}