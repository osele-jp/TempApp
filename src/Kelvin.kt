class Kelvin(temp2: Double): Temperature(Unit.K, temp = temp2) {
    override fun getTemp(): Double {
        return super.getTemp(Unit.K)
    }

    override fun getTempIn(unit: Unit): Double {
        return super.getTemp(unit)
    }

}