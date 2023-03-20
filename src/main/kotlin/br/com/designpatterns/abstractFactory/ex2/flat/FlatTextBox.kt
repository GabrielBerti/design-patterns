package br.com.designpatterns.abstractFactory.ex2.flat

import br.com.designpatterns.abstractFactory.ex2.api.TextBox

class FlatTextBox: TextBox() {
    override fun render() {
        println("FlatTextBox renderizado.")
    }
}