package ro.telacad.ktplayground.basics.collections

fun main() {

    /////////////// 1. List

    val list = listOf(1, 2, 3, 4, 5, 6, 7)

    // Iterate over lists using ListIterator
    val listIterator = list.listIterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    // Iterate over lists using for-each loops
    for (number in list) {
        println("List Number: $number")
    }

    // Iterate over lists using forEach lambda
    list.forEach { element -> println("Element from lambda: $element") }

    //////////////// 2. Sets

    // Iterate over sets using Iterator
    val set = setOf(1, 2, 3, 4)
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        println("Element: ${iterator.next()}")
    }

    // Iterate over sets using for-each loops
    for (number in set) {
        println("Set Number: $number")
    }

    // Iterate over sets using forEach lambda
    set.forEach { element -> println("Element from lambda: $element") }

    ///////////////// 3. Maps

    // Iterate over maps using Iterator over entries
    val map = mapOf<String, Int>("One" to 1, "Two" to 2, "Three" to 3)
    val entryIterator = map.entries.iterator()
    while (entryIterator.hasNext()) {
        val next = entryIterator.next()
        println("Key: ${next.key}, Value: ${next.value}")
    }

    // Iterate over maps using for-each loops
    for (entry in map.entries) {
        println("Key: ${entry.key} & Value: ${entry.value}")
    }

    // Iterate over maps using forEach lambda
    map.forEach { key, value -> println("Key from lambda $key & Value from lambda: $value") }

}