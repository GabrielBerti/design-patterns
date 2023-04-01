package br.com.designpatterns.composite.ex1

abstract class SimpleMonitoring(_sensor: Sensor?, _value: Float) : Monitoring {
    var value = 0f
    var sensor: Sensor? = null

    init {
        sensor = _sensor
        value = _value
    }
}