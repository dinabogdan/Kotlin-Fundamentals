package ro.telacad.ktplayground.basics.oop

import java.lang.IllegalArgumentException

object DogClassifier {

    fun classify(dog: Dog): Size {
        return when (dog.weight) {
            in 0..15 -> Size.S
            in 15..30 -> Size.M
            in 30..80 -> Size.L
            else -> throw IllegalArgumentException("The provided value is not valid!")
        }
    }
}