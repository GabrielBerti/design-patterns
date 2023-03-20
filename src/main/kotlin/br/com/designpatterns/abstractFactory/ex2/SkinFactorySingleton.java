package br.com.designpatterns.abstractFactory.ex2;

import br.com.designpatterns.abstractFactory.ex2.api.SkinFactory;
import br.com.designpatterns.abstractFactory.ex2.dark.DarkSkinFactory;

public class SkinFactorySingleton {

    private static SkinFactory instance;

    public static SkinFactory getInstance() {

        if (instance == null) {

            // String tipo = File.load(tipo_skin.xml);
            // if ("dark".equals(tipo)) {
            //    instance = new DarkSkinFactory();
            // } else {
            //    instance = new FlatSkinFactory();
            // }

            instance = new DarkSkinFactory();
        }

        return instance;
    }
}
