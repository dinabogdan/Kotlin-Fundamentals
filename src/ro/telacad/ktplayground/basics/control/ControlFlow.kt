package ro.telacad.ktplayground.basics.control

fun main(args: Array<String>) {

    // IF

    val a = 10
    val b = 20

    var min: Int

    min = if (a > b) {
        println("Min is b")
        b
    } else {
        println("Min is a")
        a
    }

    val min2 = if (a > b) b else a

    println(min)

    // FOR

    val listOfItems = listOf("1", "2", "3", "4")

    for (item in listOfItems) println(item)

    // WHILE

    var x = 0

    while (x < 10) {
        x++
        println(x)
    }

    // DO ... WHILE

    do {
        println(x)
        x++
    } while (x < 11)


    // RANGE

    var i: Int = 1

    if (i in 1..10) {
        println(i)
    }

    for (i in 1..10) println(i)

    for (i in 1..10 step 2) println(i)

    for (i in 10 downTo 1) println(i)

    // WHEN

    val t = 2

    when (t) {
        1 -> println("1")
        2 -> println("The value is two")
        else -> println("Another value")
    }

    val incT = when (t) {
        1 -> t + 1
        2 -> t + 3
        else -> t + 5
    }

    println(incT)

}