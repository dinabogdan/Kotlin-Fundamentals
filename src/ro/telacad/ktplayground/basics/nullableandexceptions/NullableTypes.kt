package ro.telacad.ktplayground.basics.nullableandexceptions

import ro.telacad.ktplayground.basics.oop.Breed
import ro.telacad.ktplayground.basics.oop.Dog

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