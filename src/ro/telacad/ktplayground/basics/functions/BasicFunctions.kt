package ro.telacad.ktplayground.basics.functions

//fun nameOfFunction(): Int {
//
//}


/*
    void helloWorld() {
        System.out.prinln("Hello World");
    }
 */

fun helloWorld() {
    println("Hello World")
}

fun sum(a: Int, b: Int) = a + b


fun main(args: Array<String>) {
    helloWorld()

    val sum = sum(1, 2)

    println(sum)
}