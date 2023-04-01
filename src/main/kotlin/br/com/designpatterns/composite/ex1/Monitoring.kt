package br.com.designpatterns.composite.ex1

interface Monitoring {
    fun evaluateCondition(): Boolean
    fun printCondition(): String?
}