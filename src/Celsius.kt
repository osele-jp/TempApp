class Celsius(temp2: Double): Temperature(Unit.C, temp = temp2) {
    override fun getTemp(): Double {
        return super.getTemp(Unit.C)
    }

    override fun getTempIn(unit: Unit): Double {
        return super.getTemp(unit)
    }

}