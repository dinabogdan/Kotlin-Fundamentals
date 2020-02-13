package ro.telacad.ktplayground.basics.generics

interface Animal

data class Dog(
    val id: Int,
    val name: String,
    val color: String
) : Animal

data class Cat(
    val id: Int,
    val name: String,
    val color: String
) : Animal

data class Cage<T : Animal>(
    val animal: T,
    val size: Double
)

fun main() {
    val spark = Dog(1, "Spark", "Black")
    val tom = Cat(1, "Tom", "Orange")
    val sparkCage = Cage(spark, 1.0)
    val tomCage = Cage(tom, 0.5)
}

