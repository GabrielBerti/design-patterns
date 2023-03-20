package br.com.designpatterns.singleton

class Singleton {

    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if(instance == null) {
                instance = Singleton()
            }

            return instance as Singleton
        }
    }

}