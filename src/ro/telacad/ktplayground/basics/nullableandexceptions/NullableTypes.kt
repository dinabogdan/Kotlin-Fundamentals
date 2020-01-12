package ro.telacad.ktplayground.basics.nullableandexceptions

import ro.telacad.ktplayground.basics.oop.Breed
import ro.telacad.ktplayground.basics.oop.Dog

/**
 * Using String as the type of parameter message
 * will enforce the constraint that the `null` value
 * cannot be passed to this parameter.
 *
 * Instead of receiving a NullPointerException at runtime
 * we will receive a compile-time error, which is desirable.
 */
fun printMessage(message: String) {
    println(message)
}

fun main() {
    var number: Int? = null
    println(number)
    number = 5
    println(number)

    // It will generate a compile-time error
//    printMessage(null)

//    val dog: Dog? = Dog.anInstance("Spark", 25, Breed.LABRADOR)
    val dog: Dog? = null
    dog?.bark()

}