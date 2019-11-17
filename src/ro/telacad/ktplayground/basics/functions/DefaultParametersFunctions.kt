package ro.telacad.ktplayground.basics.functions

fun displayGreeting(message: String, name: String = "Guest") {
    println("Hello $name, $message!")
}

fun multiply(a: Int, b: Int, c: Int = 1) = a * b * c

fun main(args: Array<String>) {
    displayGreeting("Welcome to Kotlin Fundamentals")
    println(multiply(2, 3))
    println(multiply(2, 3, 4))
}