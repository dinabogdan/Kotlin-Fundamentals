package ro.telacad.ktplayground.basics.oop

class Dog private constructor(
    val name: String,
    val weight: Int,
    val breed: Breed
) {

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