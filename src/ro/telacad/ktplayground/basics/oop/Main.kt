package ro.telacad.ktplayground.basics.oop

fun main() {

    val dog = Dog.Factory.anInstance(name = "Spark", weight = 19, breed = Breed.BULLDOG)

    dog.bark()

    println("The dog name is: ${dog.name}")

    val dogSize = DogClassifier.classify(dog)

    println("Dog ${dog.name} it's a ${dogSize.value} one!")
}