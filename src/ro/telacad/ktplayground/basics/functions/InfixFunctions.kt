package ro.telacad.ktplayground.basics.functions

infix fun MutableList<String>.add(item: String) {
    this.add(item)
}

infix fun MutableList<String>.`contains ?`(item: String): Boolean {
    return this.contains(item)
}

fun main() {

//    val pair = Pair("One", 1)
    val pair: Pair<String, Int> = "One" to 1
    println("First: ${pair.first}; Second: ${pair.second}")

    val numbers = mutableListOf("One", "Two", "Three")
    numbers add "Four"
    println(numbers)
    println(numbers `contains ?` "Five")

}