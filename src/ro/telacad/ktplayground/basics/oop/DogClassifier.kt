package ro.telacad.ktplayground.basics.oop

object DogClassifier {

    fun classify(dog: Dog) {
        when (dog.weight) {
            in 0..15 -> println("Dog ${dog.name} is a small one!")
            in 15..30 -> println("Dog ${dog.name} is a medium sized one!")
            in 30..80 -> println("Dog ${dog.name} is a big sized one!")
        }
    }
}