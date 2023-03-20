package br.com.designpatterns.abstractFactory.ex2.dark

import br.com.designpatterns.abstractFactory.ex2.api.Button

class DarkButton: Button() {
    override fun render() {
        println("DarkButton renderizado.")
    }
}