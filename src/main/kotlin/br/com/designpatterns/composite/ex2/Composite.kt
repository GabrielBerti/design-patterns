package br.com.designpatterns.composite.ex2

abstract class Composite(_c: Component) : Component() {
    private val components: MutableCollection<Component> = ArrayList()

    init {
        add(_c)
    }

    override fun anOperation() {
        for (c in components) {
            c.anOperation()
        }
    }

    fun add(_c: Component) {
        if (_c !== this) {
            components.add(_c)
        }
    }
}

