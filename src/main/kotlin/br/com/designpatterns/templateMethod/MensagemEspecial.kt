package br.com.designpatterns.templateMethod

class MensagemEspecial: Mensagem() {
    override fun parte(pontos: Int): String {
        return if(pontos <= 1) {
            "abaixo do esperado"
        } else if (pontos <= 3) {
            "regular"
        } else if (pontos <= 6) {
            "muito bom"
        } else {
            "excepcional"
        }
    }

}