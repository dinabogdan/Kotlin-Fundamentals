package ro.telacad.ktplayground.basics.functions

fun printAll(vararg items: String) {
    for (item in items) {
        println(item)
    }
}

fun printAllWithMoreParameters(lastItem: String, vararg items: String) {
    for (item in items) {
        println(item)
    }
    println(lastItem)
}

fun main() {
    printAll("First", "Second", "Third", "Fourth")
    val listOfStrings = listOf("1", "2", "3", "4", "5")
    val arrayOfStrings = arrayOf("1", "2", "3", "4", "5")
    println()
    printAll(*listOfStrings.toTypedArray())
    println()
    printAll(*arrayOfStrings)

    println()
    printAllWithMoreParameters(items = *arrayOfStrings, lastItem = "6")
}