package br.com.designpatterns.strategy

abstract class MediaStrategy {
    abstract fun perform(_provas: Collection<Prova?>?): Double
}