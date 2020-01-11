package ro.telacad.ktplayground.basics.oop

class Dog private constructor(
    val name: String,
    val weight: Int,
    val breed: Breed
) {

    lateinit var activities: Array<String>

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