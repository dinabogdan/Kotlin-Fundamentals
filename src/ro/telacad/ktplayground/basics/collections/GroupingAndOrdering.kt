package ro.telacad.ktplayground.basics.collections

data class Person(
    val age: Int,
    val name: String
)

fun main() {

    // A. Grouping using groupBy()

    val numbers = listOf(1, 2, 3, 4, 5)

    val groupedNumbers = numbers.groupBy { number -> number % 2 == 0 }
    println(groupedNumbers)

    // B. Ordering

    // B1 - Natural Ordering using sorted() and sortedDescending()
    val numbers2 = listOf(3, 5, 1, 2, 7, 8, 4)
    val ascendingNumbers = numbers2.sorted()
    println("Ascending numbers: $ascendingNumbers")
    val descendingNumbers = numbers2.sortedDescending()
    println("Descending numbers: $descendingNumbers")

    // B2 - Explicit Ordering using sortedBy()
    val popescu = Person(33, "Popescu")
    val ionescu = Person(32, "Ionescu")
    val georgescu = Person(44, "Georgescu")
    val alexandrescu = Person(22, "Alexandrescu")
    val persons = listOf(popescu, ionescu, georgescu, alexandrescu)
    val sortedPersons = persons.sortedBy { person -> person.age }
    println("Sorted persons: $sortedPersons")

    // B3 - Reverse Ordering using reversed()
    val pets = listOf("Dog", "Cat", "Canary", "Fish")
    println("Reversed pets: ${pets.reversed()}")

    // B4 - Random Ordering using shuffled()
    println("Shuffled pets: ${pets.shuffled()}")

}