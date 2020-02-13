package ro.telacad.ktplayground.basics.generics

// top-level generic function
fun <T : Animal> aNewCage(animal: T, size: Double): Cage<T> {
    return Cage(animal, size)
}

// generic extension function
fun <T> List<T>.addOne(element: T): List<T> {
    return this + element
}

fun main() {

    // 1. Generic function (in a class, or as a top-level function)

    val spark = Dog(1, "Spark", "Black")

    val sparkCage = aNewCage(spark, 1.0)

    println(sparkCage.toString())

    // 2. Generic extension function

    val numbers = listOf(1, 2, 3, 4, 5)

    val newNumbers = numbers.addOne(6)

    println(newNumbers)


}