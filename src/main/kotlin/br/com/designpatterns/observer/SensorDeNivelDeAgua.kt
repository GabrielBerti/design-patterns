package br.com.designpatterns.observer

class SensorDeNivelDeAgua: SensorDeLeitura() {

    var nivelEmMetros: Double? = null
        private set

    fun setNivelEmMetros(nivelEmMetros: Double?) {
        this.nivelEmMetros = nivelEmMetros
        _notify()
    }
}