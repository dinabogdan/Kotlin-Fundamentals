package ro.telacad.ktplayground.basics.collections

fun main() {

    // 1. Construct a sequence using sequenceOf()
    val numbers = sequenceOf(1, 2, 3, 4, 5)
    numbers.forEach { println(it) }

    // 2. Construct a sequence from a collection using asSequence()
    val listOfNumbers = listOf(1, 2, 3, 4, 5)
    val numberSequence = listOfNumbers.asSequence()

    // 3. Sequence operations: filter(), take(), drop()
    val greaterThanThreeNumbers = numbers.filter { number -> number > 3 }
    println("The numbers greater than 3 are: ")
    greaterThanThreeNumbers.forEach { println(it) }

    val firstOneElement = greaterThanThreeNumbers.take(1)
    println("First element from the greater than 3 sequence is:")
    firstOneElement.forEach { println(it) }

    val numbersWithoutFirstThreeElems = numbers.drop(3)
    println("Numbers without first 3 elements:")
    numbersWithoutFirstThreeElems.forEach { println(it) }

    // 4. Terminal operations: toList(), sum()
    var i = 0
    val result = listOfNumbers.asSequence()
        .filter { number ->
            i++
            number % 2 == 0
        }.map { number ->
            i++
            number * 2
        }

    println("The value of i before terminal operation is: $i")

    result.toList()

    println("The value of i after terminal operation is: $i")

    // 5. Using sequence in processing - Iterable vs Sequence
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)

    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars")
// terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())

}