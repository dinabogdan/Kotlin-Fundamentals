package ro.telacad.ktplayground.basics.lambdas

data class Person(val name: String, val age: Int)

fun main() {
    val ionescu = Person("Ionescu", 29)
    val popescu = Person("Popescu", 33)
    val radulescu = Person("Radulescu", 40)
    val georgescu = Person("Georgescu", 21)
    val cristescu = Person("Cristescu", 27)

    val persons = mutableListOf(radulescu, popescu, georgescu, cristescu, ionescu)

    // 1. Usage of `sortBy` lambda expression.
    persons.sortBy { person -> person.age }
    println(persons)

    // 2. Define some simple custom lambda functions.
    val addOne: (Int) -> Int = { x -> x + 1 }
    println(addOne(3))
    println(addOne(100))

    val noInputLambda: () -> String = { "Something should happen here!" }
    println(noInputLambda())

    // 3. Types of a lambda function

    // a. UnaryOperator has type: (T) -> T
    val multiplyByFive: (Int) -> Int = { x -> x * 5 }
    println("10 multiplied by 5: ${multiplyByFive(10)}")
    println("123 multiplied by 5: ${multiplyByFive(123)}")

    // b. BinaryOperator has type: (T, T) -> T
    val sumIntegers: (Int, Int) -> Int = { x, y -> x + y }
    println("Sum of 5 and 6: ${sumIntegers(5, 6)}")
    println("Sum of 12345 and 54321: ${sumIntegers(12345, 54321)}")

    // c. Predicate has type: (T) -> Boolean
    val isEven: (Int) -> Boolean = { x -> x % 2 == 0 }
    println("5 is even: ${isEven(5)}")
    println("10 is even: ${isEven(10)}")

    // d. Function has type: (T) -> R
    val parseString: (String) -> Int = { x -> x.toInt() }
    println("${parseString("10")}")
    println("${parseString("123")}")

    // e. Supplier has type: () -> T
    val get: () -> String = { "Hello world!" }
    println(get())

    // f. Consumer has type: (T) -> ()
    val accept: (String) -> Unit = { Unit }
    println("${accept("Hello world!")}")

    // 4. `it` keyword
    val result = listOf(1, 2, 3, 4, 5, 6).asSequence()
        .map { it + 10 }
        .toList()
    println("After adding 10 to each element: $result")

}