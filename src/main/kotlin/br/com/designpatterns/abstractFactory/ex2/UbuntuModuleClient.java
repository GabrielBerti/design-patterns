package br.com.designpatterns.abstractFactory.ex2;

public class UbuntuModuleClient {

    public static void main(String[] args) {
        SkinFactorySingleton.getInstance().createButton().render();
        SkinFactorySingleton.getInstance().createTextBox().render();
    }
}