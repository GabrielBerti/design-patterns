package br.com.designpatterns.observer

abstract class SensorDeComporta: SensorDeAtuacao() {

    var nivelAtualEmMetros: Double? = null
    var sensorDeNivelDeAgua: SensorDeNivelDeAgua? = null

    override fun update() {
        this.nivelAtualEmMetros = this.sensorDeNivelDeAgua?.nivelEmMetros
    }
}