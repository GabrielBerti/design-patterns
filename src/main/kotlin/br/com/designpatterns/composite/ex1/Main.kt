package br.com.designpatterns.composite.ex1

fun main(args: Array<String>) {
    val x = Sensor( 10.0f)
    val y = Sensor(100.0f)
    val z = Sensor(3.0f)

    // (10.0 > 5.0)

    // (10.0 > 5.0)
    val ltm: Monitoring = LessThanMonitoring(x, 5.0f)
    // (10.0 < 20.0)
    // (10.0 < 20.0)
    val gtm: Monitoring = GreaterThanMonitoring(x, 20.0f)

    // ((10.0 > 5.0) OR (10.0 < 20.0))

    // ((10.0 > 5.0) OR (10.0 < 20.0))
    val cm1: CompoundMonitoring = OrMonitoring(ltm, gtm)

    // (100.0 = 100.0)

    // (100.0 = 100.0)
    val etm: Monitoring = EqualsToMonitoring(y, 100f)

    // ((10.0 > 5.0) OR (10.0 < 20.0)) AND (100.0 = 100.0)

    // ((10.0 > 5.0) OR (10.0 < 20.0)) AND (100.0 = 100.0)
    val cm2: CompoundMonitoring = AndMonitoring(cm1, etm)

    // (3.0 < 5.0)

    // (3.0 < 5.0)
    val gtm2: Monitoring = GreaterThanMonitoring(z, 5.0f)
    // (3.0 > 2.0)
    // (3.0 > 2.0)
    val ltm2: Monitoring = LessThanMonitoring(z, 2.0f)
    // ((3.0 < 5.0) OR (3.0 > 2.0))
    // ((3.0 < 5.0) OR (3.0 > 2.0))
    val cm3: CompoundMonitoring = OrMonitoring(gtm2, ltm2)

    // (((10.0 > 5.0) OR (10.0 < 20.0)) AND (100.0 = 100.0) AND ((3.0 < 5.0) OR (3.0 > 2.0)))

    // (((10.0 > 5.0) OR (10.0 < 20.0)) AND (100.0 = 100.0) AND ((3.0 < 5.0) OR (3.0 > 2.0)))
    cm2.addMonitoring(cm3)

    println(cm2.printCondition())
    println(cm2.evaluateCondition())
}