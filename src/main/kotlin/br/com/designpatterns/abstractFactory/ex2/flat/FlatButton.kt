package br.com.designpatterns.abstractFactory.ex2.flat

import br.com.designpatterns.abstractFactory.ex2.api.Button

class FlatButton: Button() {
    override fun render() {
        println("FlatButton renderizado.")
    }
}