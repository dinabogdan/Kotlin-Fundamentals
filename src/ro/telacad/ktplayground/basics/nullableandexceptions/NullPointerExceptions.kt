package ro.telacad.ktplayground.basics.nullableandexceptions

import ro.telacad.ktplayground.basics.oop.Dog

fun main() {
    // 1. Explicitly throwing a NullPointerException
//    throw NullPointerException("A NPE!")

    //2. Using Non-Null assertions - `!!`
    val dog: Dog? = null
    println(dog?.sex?.name)
    println(dog!!.sex.name)

    //3. Data inconsistencies

}