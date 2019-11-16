package ro.telacad.ktplayground.basics.types

fun main(args: Array<String>) {

    // immutable variables

    val someVar: Byte = 10

    val aSomeIntVar: Int = 11

    // val someChar: char = 5

    val someChar: Char = 'a'
    val anotherChar: Char = '5'

    println(someVar::class)

    // mutable variables

    var someMutableVar = 10

    println(someMutableVar)

    someMutableVar = 11

    println(someMutableVar)


}