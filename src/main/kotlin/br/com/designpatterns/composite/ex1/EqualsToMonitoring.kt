package br.com.designpatterns.composite.ex1
class EqualsToMonitoring(_sensor: Sensor?, _value: Float) : SimpleMonitoring(_sensor, _value) {
    override fun evaluateCondition(): Boolean {
        return value == sensor?.value
    }

    override fun printCondition(): String {
        return "(" + sensor?.value + " = " + value + ")"
    }
}