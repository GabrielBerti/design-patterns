package br.com.designpatterns.observer

abstract class SensorDeLeitura {

    private var sensoresDeAtuacao: ArrayList<SensorDeAtuacao> = arrayListOf()

    open fun attach(_o: SensorDeAtuacao?) {
        if (_o != null) {
            this.sensoresDeAtuacao.add(_o)
        }
    }

    open fun detach(_o: SensorDeAtuacao?) {
        this.sensoresDeAtuacao.remove(_o)
    }

    open fun _notify() {
        for (sda in this.sensoresDeAtuacao) {
            sda.update()
        }
    }
}