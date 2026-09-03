class Fahrenheit(temp2: Double): Temperature(Unit.F, temp = temp2) {
    override fun getTemp(): Double {
        return super.getTemp(Unit.F)
    }

    override fun getTempIn(unit: Unit): Double {
        return super.getTemp(unit)
    }

}