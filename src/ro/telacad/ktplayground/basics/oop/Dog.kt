package ro.telacad.ktplayground.basics.oop

class Dog(
    val name: String,
    val weight: Int,
    val breed: String
) {
    
    fun bark() {
        if (weight < 20) {
            println("Small barking, something like yip!!")
        } else {
            println("Noisy barking, something like ROUGH!!!!")
        }
    }
}

fun main() {
    val dog = Dog(name = "Spark", weight = 19, breed = "Mixed")

    dog.bark()

}