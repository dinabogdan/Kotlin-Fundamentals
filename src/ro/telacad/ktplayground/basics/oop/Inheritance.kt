package ro.telacad.ktplayground.basics.oop


/**
 * Superclass
 */
open class Animal {
    open val name: String = ""
    open val food: String = ""
    open val habitat: String = ""

    open fun makeNoise() {
        println("The Animal is making noise!")
    }

    open fun eat() {
        println("The Animal is eating!")
    }

    open fun sleep() {
        println("The animal is sleeping!")
    }
}

/**
 * Subclass
 *
 * We say that subclass extends the superclass
 * eg: Hippo (subclass) extends Animal (superclass)
 */
class Hippo : Animal() {
    override val name = "Bobby"
    override val food = "Grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Hippo $name is making noise")
    }

    override fun eat() {
        println("Hippo $name is eating $food")
    }

    override fun sleep() {
        println("The Hippo $name is sleeping in $habitat")
    }
}

class Veterinary {
    fun giveShot(animal: Animal) {
        println("The veterinary is giving a shot to ${animal.name}")
        animal.makeNoise()
    }
}

fun main() {
    val animal = Animal()
    animal.makeNoise()

    val hippo = Hippo()
    val hippoAnimal: Animal = Hippo()
    hippo.makeNoise()
    hippoAnimal.makeNoise()

    val animals: Array<Animal> = arrayOf(animal, hippo)
    val veterinary = Veterinary()
    for (a in animals) {
        veterinary.giveShot(a)
    }
}