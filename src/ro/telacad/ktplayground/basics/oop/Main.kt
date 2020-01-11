package ro.telacad.ktplayground.basics.oop

fun main() {

    val dog = Dog.Factory.anInstance(name = "Spark", weight = 19, breed = Breed.BULLDOG)

    dog.bark()

    println("The dog name is: ${dog.name}")

//    val dogSize = DogClassifier.classify(dog)

    println("Dog ${dog.name} it's a ${dog.size} one!")

//    dog.sex = Sex.N_A  An IllegalArgumentException is thrown!
    dog.sex = Sex.M
    println("Dog ${dog.name} has sex: ${dog.sex}")
//    dog.activities = arrayOf("Walking", "Eating")
    println("Dog ${dog.name} is doing the following activities:")
    for (activity in dog.activities) {
        print("$activity ")
    }

    // ==

    val dog1 = Dog.anInstance("Spark", 19, Breed.BULLDOG)
    val dog2: Any = Dog.anInstance("Spark", 19, Breed.BULLDOG)

    println(dog1 == dog2)
    println(dog1.hashCode())
    println(dog2.hashCode())
    println(dog1.toString())

    val dog3 = dog1.copy(name = "Bucky")
    println(dog3.toString())

}