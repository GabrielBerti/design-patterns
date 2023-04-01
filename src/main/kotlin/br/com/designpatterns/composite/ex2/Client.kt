package br.com.designpatterns.composite.ex2

fun main(args: Array<String>) {
    val l1: Component = Leaf1()
    val l2: Component = Leaf2()
    val ln = LeafN()

    val c1: Composite = ConcreteComposite(l1)
    c1.add(l2)
    c1.add(ln)

    println("Imprimimando a primeira árvore:")
    c1.anOperation()

    val c2: Composite = ConcreteComposite(c1)
    c2.add(l1)

    println("\n\nImprimimando a segunda árvore:")
    c2.anOperation()
}