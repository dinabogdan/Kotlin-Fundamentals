package ro.telacad.ktplayground.basics.lambdas

// If I want to convert meters to Kms I can write a function like the following one.
fun metersToKms(value: Double): Double {
    return value / 1000
}

// But If I want to convert cms to meters, or grams to Kgs, etc.,
// I can create a more generic function like the following one.
fun converter(value: Double, multiplicationFactor: Double): Double {
    return value * multiplicationFactor
}

// Buuut, if I want to create a conversion function for something
// which has a more complex conversion algorithm (eg: Celsius to Fahrenheit),
// then I need something more.

// This higher-order function seems to be pretty reasonable.
// A higher-order function which takes a function as a parameter.
fun convert(value: Double, converter: (Double) -> Double): Double {
    return converter(value)
}

// Another way to do conversion using a higher-order function which returns a function.
fun conversionLambda(transformation: String): (Double) -> Double {
    return when (transformation) {
        "MetersToKm" -> { meters -> meters / 1000 }
        "CentimetersToMeters" -> { centimeters -> centimeters / 100 }
        "CelsiusToFahrenheit" -> { celsius -> celsius * 1.8 + 32 }
        else -> throw IllegalArgumentException("The $transformation is not valid")
    }
}

fun main(args: Array<String>) {
    println("M to Km: ${converter(1000.0, 0.001)}") // M to Km: 1.0
    println("Cm to M: ${converter(100.0, 0.01)}") // Cm to M: 1.0

    println("M to Km: ${convert(1000.0) { meters -> meters / 1000 }}") // M to Km: 1.0
    println("Cm to M: ${convert(100.0) { cm -> cm / 100 }}") // Cm to M: 1.0
    println("Celsius to Fahrenheit: ${convert(30.0) { celsius -> celsius * 1.8 + 32 }}") // Celsius to Fahrenheit: 86.0

    println("M to Km: ${conversionLambda("MetersToKm")(1000.0)}") //M to Km: 1.0
    println("Cm to M: ${conversionLambda("CentimetersToMeters")(100.0)}") //Cm to M: 1.0
    println("Celsius to Fahrenheit: ${conversionLambda("CelsiusToFahrenheit")(30.0)}") //Celsius to Fahrenheit: 86.0

    println("M to Km: ${convert(1000.0, conversionLambda("MetersToKm"))}") //M to Km: 1.0
    println("Cm to M: ${convert(100.0, conversionLambda("CentimetersToMeters"))}") //Cm to M: 1.0
    println("Celsius to Fahrenheit: ${convert(30.0, conversionLambda("CelsiusToFahrenheit"))}") //Celsius to Fahrenheit: 86.0
}