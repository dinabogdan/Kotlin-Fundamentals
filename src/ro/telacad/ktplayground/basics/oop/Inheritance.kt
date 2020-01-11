package ro.telacad.ktplayground.basics.oop


/**
 * Superclass
 */
abstract class Animal() {
    open val name: String = ""
    open val food: String = ""
    open val habitat: String = ""

    abstract fun makeNoise()

    abstract fun eat()

    abstract fun sleep()
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

abstract class WildCanine : Animal() {
    override val food = "Meat"
    override val habitat = "Forest"
}

class Fox : WildCanine() {
    override val name = "Foxy"
//    override val food = "Meat"
//    override val habitat = "Forest"

    override fun makeNoise() {
        println("Fox $name is making noise")
    }

    override fun eat() {
        println("Fox $name is eating $food")
    }

    override fun sleep() {
        println("Fox $name is eating $food")
    }
}

class Wolf : WildCanine() {
    override val name = "Teddy"
//    override val food = "Meat"
//    override val habitat = "Forest"

    override fun makeNoise() {
        println("Wolf $name is making noise")
    }

    override fun eat() {
        println("Wolf $name is eating $food")
    }

    override fun sleep() {
        println("Wolf $name is eating $food")
    }
}

class Veterinary {
    fun giveShot(animal: Animal) {
        println("The veterinary is giving a shot to ${animal.name}")
        animal.makeNoise()
    }
}

fun main() {
    val hippo = Hippo()
    val wolf = Wolf()
    val fox = Fox()

    fox.eat()
    wolf.eat()

//    val hippoAnimal: Animal = Hippo()
//    hippo.makeNoise()
//    hippoAnimal.makeNoise()

    val animals: Array<Animal> = arrayOf(wolf, fox, hippo)
    val veterinary = Veterinary()
    for (a in animals) {
        veterinary.giveShot(a)
    }
}