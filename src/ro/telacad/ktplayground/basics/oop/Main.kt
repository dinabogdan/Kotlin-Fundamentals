package ro.telacad.ktplayground.basics.oop

fun main() {

    val dog = Dog.Factory.anInstance(name = "Spark", weight = 19, breed = "Mixed")

    dog.bark()

    println("The dog name is: ${dog.name}")

    DogClassifier.classify(dog)
}