package br.com.designpatterns.observer

fun main(args: Array<String>) {
    val sda = SensorDeNivelDeAgua()

    val sa = SensorDeAberturaDeComporta()
    sa.nivelDeAberturaEmMetros = 45.0
    sa.sensorDeNivelDeAgua = sda
    sda.attach(sa)

    val sf = SensorDeFechamentoDeComporta()
    sf.nivelDeFechamentoEmMetros = 40.0
    sf.sensorDeNivelDeAgua = sda
    sda.attach(sf)

    sda.setNivelEmMetros(49.0)
}