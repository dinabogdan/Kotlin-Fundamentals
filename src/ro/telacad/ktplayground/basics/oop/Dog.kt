package ro.telacad.ktplayground.basics.oop

import java.lang.IllegalArgumentException

typealias Kg = Int

data class Dog private constructor(
    val name: String,
    val weight: Kg,
    val breed: Breed
) {

    lateinit var activities: Array<String>
    val size: String
        get() {
            return DogClassifier.classify(this).value
        }

    var sex: Sex = Sex.N_A
        set(value) {
            if (value == Sex.N_A) {
                throw IllegalArgumentException("The provided value is not valid!")
            }
            field = value
        }
        get() {
            if (field == Sex.N_A) {
                throw UninitializedPropertyAccessException("The field sex was not initialized")
            }
            return field
        }

    init {
        // complex initializing code

        println("The dog with $name and $weight of breed $breed was created")

        val size = DogClassifier.classify(this)
        activities = when (size) {
            Size.S -> arrayOf("walking", "playing")
            Size.M -> arrayOf("walking")
            Size.L -> arrayOf("walking", "eating a lot", "sleeping")
        }
    }

    fun bark() {
        if (weight < 20) {
            println("Small barking, something like yip!!")
        } else {
            println("Noisy barking, something like ROUGH!!!!")
        }
    }

    companion object Factory {
        fun anInstance(name: String, weight: Int, breed: Breed): Dog {
            return Dog(
                name = name,
                weight = weight,
                breed = breed
            )
        }
    }
}