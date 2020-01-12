package ro.telacad.ktplayground.basics.nullableandexceptions

import ro.telacad.ktplayground.basics.oop.Breed
import ro.telacad.ktplayground.basics.oop.Dog

fun main() {
    val dog: Dog? = Dog.anInstance("Spark", 20, Breed.BULLDOG)
    val nullDog: Dog? = null
    println("Name length: ${dog?.name?.length}")
    println("Name length: ${nullDog?.name?.length ?: 0}")
}