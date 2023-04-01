package br.com.designpatterns.composite.ex1

class GreaterThanMonitoring(_sensor: Sensor?, _value: Float) : SimpleMonitoring(_sensor, _value) {
    override fun evaluateCondition(): Boolean {
        return sensor?.value!! < value
    }

    override fun printCondition(): String {
        return "(" + sensor?.value + " < " + value + ")"
    }
}