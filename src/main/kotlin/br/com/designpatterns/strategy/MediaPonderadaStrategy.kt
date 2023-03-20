package br.com.designpatterns.strategy

class MediaPonderadaStrategy: MediaStrategy() {
    override fun perform(_provas: Collection<Prova?>?): Double {
        return 0.0
    }
}