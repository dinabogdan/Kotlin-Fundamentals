package ro.telacad.ktplayground.basics.generics

fun <T> addWhenNotExists(list: List<T>, element: T): List<T>
        where T : Animal,
              T : Comparable<T> {
    return if (list.contains(element)) {
        list
    } else list + element
}

fun main() {

    // 1. Upper-bound constraint

    // The following code will generate a compile-time error.
    // The behavior it's right as long as we don't want to be able to
    //  instantiate a Cage for a type like String.

//    val stringCage = Cage("a String instead of an animal", 0.01)



    // 2. Multiple constraints

    // The following code will generate a compile-time error.
    // In order to solve the compile-time error it's needed to be extended the Comparable<T> interface
    //  by the Animal interface. Also, the compareTo() function must be override by all the classes
    //  which are implementing the Animal interface.

//    val spark = Dog(1, "Spark", "Black")
//    addWhenNotExists(emptyList<Animal>(), spark)



}