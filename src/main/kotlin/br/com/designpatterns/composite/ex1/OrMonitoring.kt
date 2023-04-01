package br.com.designpatterns.composite.ex1

class OrMonitoring(m1: Monitoring?, m2: Monitoring?) : CompoundMonitoring(m1!!, m2!!) {
    override fun evaluateCondition(): Boolean {
        for (m in getMonitorings()) {
            if (m.evaluateCondition()) {
                return true
            }
        }
        return false
    }

    override fun printCondition(): String {
        var result = "("
        for (m in getMonitorings()) {
            if ("(" != result &&
                (getMonitorings() as ArrayList<*>).iterator().hasNext()
            ) {
                result += " OR "
            }
            result += m.printCondition()
        }
        return "$result)"
    }
}
