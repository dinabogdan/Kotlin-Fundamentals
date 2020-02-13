package ro.telacad.ktplayground.basics.generics

fun someList(): List<*> {
    return listOf("some string")
}


fun main() {
    val strings: List<String> = listOf("abc", "zzz", "foo")

    val result = someList()

//    if(result is List<String>) // compile-time error; result has an erased type.

    result as List<String> // Unchecked-cast warning
}