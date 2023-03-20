package br.com.designpatterns.abstractFactory.ex2.api

abstract class SkinFactory {
    abstract fun createButton(): Button
    abstract fun createTextBox(): TextBox
}