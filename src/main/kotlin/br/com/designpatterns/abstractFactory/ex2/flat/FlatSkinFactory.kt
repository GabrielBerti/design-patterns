package br.com.designpatterns.abstractFactory.ex2.flat

import br.com.designpatterns.abstractFactory.ex2.api.Button
import br.com.designpatterns.abstractFactory.ex2.api.SkinFactory
import br.com.designpatterns.abstractFactory.ex2.api.TextBox

class FlatSkinFactory: SkinFactory() {
    override fun createButton(): Button {
        return FlatButton()
    }

    override fun createTextBox(): TextBox {
        return FlatTextBox()
    }
}