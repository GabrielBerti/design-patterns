package br.com.designpatterns.strategy

class MediaAritmeticaStrategy : MediaStrategy() {

    override fun perform(_provas: Collection<Prova?>?): Double {
        var somatorio = 0.0
        if (_provas != null) {
            for (prova in _provas) {
                somatorio += prova?.nota ?: 0.0
            }

            return somatorio / _provas.size
        }

        return 0.0
    }

}