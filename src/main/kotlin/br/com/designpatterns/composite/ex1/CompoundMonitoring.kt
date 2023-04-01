package br.com.designpatterns.composite.ex1

abstract class CompoundMonitoring(m1: Monitoring, m2: Monitoring) : Monitoring {
    private var monitorings: MutableCollection<Monitoring> = ArrayList<Monitoring>()

    init {
        monitorings.add(m1)
        monitorings.add(m2)
    }

    fun getMonitorings(): Collection<Monitoring> {
        return monitorings
    }

    fun setMonitorings(monitorings: MutableCollection<Monitoring>) {
        this.monitorings = monitorings
    }

    fun addMonitoring(monitoring: Monitoring) {
        monitorings.add(monitoring)
    }
}