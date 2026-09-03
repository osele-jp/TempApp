//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val myKelvinTemp = Kelvin(100.0)
    val myFahrenTemp = Fahrenheit(100.0)
    val myCelTemp = Celsius(100.0)

    println("Kelvin Class base temp is " + myKelvinTemp.getTemp() )
    println("Fahren Class base temp is " + myFahrenTemp.getTemp() )
    println("Cel Class base temp is " + myCelTemp.getTemp() )

    println()
    println("100 K in Celsius: " + myKelvinTemp.getTempIn(Temperature.Unit.C))
    println("100 K in Fahrenheit: " + myKelvinTemp.getTempIn(Temperature.Unit.F))

    println()
    println("100 F in Celsius: " + myFahrenTemp.getTempIn(Temperature.Unit.C))
    println("100 F in Kelvin: " + myFahrenTemp.getTempIn(Temperature.Unit.K))

    println()
    println("100 C in Fahrenheit: " + myCelTemp.getTempIn(Temperature.Unit.F))
    println("100 C in Kelvin: " + myCelTemp.getTempIn(Temperature.Unit.K))
}   