package ro.telacad.ktplayground.basics.generics

import java.lang.StringBuilder

// Because of type erasure the following code it's not valid.
// The compiler generates a compile-time error.
// In order to be able to create such a thing, you should use `inline` + `reified`.
//fun <T> membersOf() = T::class.members // Compile-time error

inline fun <reified T> membersOf() = T::class.members

fun main() {
    println(membersOf<StringBuilder>().joinToString { "Telacad" })
}