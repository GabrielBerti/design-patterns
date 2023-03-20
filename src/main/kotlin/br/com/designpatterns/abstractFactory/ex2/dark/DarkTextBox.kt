package br.com.designpatterns.abstractFactory.ex2.dark

import br.com.designpatterns.abstractFactory.ex2.api.TextBox

class DarkTextBox: TextBox() {
    override fun render() {
        println("DarkTextBox renderizado.")
    }
}