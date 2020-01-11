package ro.telacad.ktplayground.basics.oop

import java.io.Serializable

interface Moveable : Serializable {
    val speed: Int

    fun move()
}

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
class Hippo(override val speed: Int = 20) : Animal(), Moveable {
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

    override fun move() {
        println("The Hippo $name is moving with $speed km/h!")
    }
}

abstract class WildCanine : Animal(), Moveable {
    override val food = "Meat"
    override val habitat = "Forest"
}

class Fox(override val speed: Int = 40) : WildCanine() {
    override val name = "Foxy"

    override fun makeNoise() {
        println("Fox $name is making noise")
    }

    override fun eat() {
        println("Fox $name is eating $food")
    }

    override fun sleep() {
        println("Fox $name is eating $food")
    }

    override fun move() {
        println("Fox $name is moving with $speed km/h")
    }
}

class Wolf(override val speed: Int = 40) : WildCanine() {
    override val name = "Teddy"

    override fun makeNoise() {
        println("Wolf $name is making noise")
    }

    override fun eat() {
        println("Wolf $name is eating $food")
    }

    override fun sleep() {
        println("Wolf $name is eating $food")
    }

    override fun move() {
        println("Wolf $name is moving with $speed km/h")
    }
}

class Vehicle(
    val name: String, override val speed: Int = 100
) : Moveable {
    override fun move() {
        println("The vehicle $name is moving $speed km/h!")
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
    val vehicle = Vehicle("Mercedes")

    fox.eat()
    wolf.eat()

//    val hippoAnimal: Animal = Hippo()
//    hippo.makeNoise()
//    hippoAnimal.makeNoise()

    val moveableObjects = arrayOf(wolf, fox, hippo, vehicle)


    // Smart cast operator
    for (moveable in moveableObjects) {
        when (moveable) {
            is Animal -> {
                moveable.move()
                moveable.makeNoise()
            }
            is Vehicle -> moveable.move()
        }
    }

    //Explicit cast
    // The following code will generate a ClassCastException
//    for (moveable in moveableObjects) {
//        (moveable as Animal).makeNoise()
//        moveable.move()
//    }

    val animals: Array<Animal> = arrayOf(wolf, fox, hippo)
    val veterinary = Veterinary()
    for (a in animals) {
        veterinary.giveShot(a)
    }
}