package ro.telacad.ktplayground.basics.functions

/**
 * This is a top-level function.
 * Calling this function doesn't imply the usage of an object instance.
 * It is important to keep in mind that this function's bytecode represents a Java static function.
 */

fun printMessage(message: String) {
    println("Message is: $message")
}