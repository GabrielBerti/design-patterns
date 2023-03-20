package br.com.designpatterns.abstractFactory.ex2.dark

import br.com.designpatterns.abstractFactory.ex2.api.Button
import br.com.designpatterns.abstractFactory.ex2.api.SkinFactory
import br.com.designpatterns.abstractFactory.ex2.api.TextBox

class DarkSkinFactory: SkinFactory() {
    override fun createButton(): Button {
        return DarkButton()
    }

    override fun createTextBox(): TextBox {
        return DarkTextBox()
    }
}