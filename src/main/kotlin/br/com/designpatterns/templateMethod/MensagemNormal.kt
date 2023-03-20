package br.com.designpatterns.templateMethod

class MensagemNormal: Mensagem() {
    override fun parte(pontos: Int): String {
        return if(pontos <= 4) {
            "abaixo do esperado"
        } else if (pontos <= 7) {
            "regular"
        } else if (pontos <= 9) {
            "muito bom"
        } else {
            "excepcional"
        }
    }
}