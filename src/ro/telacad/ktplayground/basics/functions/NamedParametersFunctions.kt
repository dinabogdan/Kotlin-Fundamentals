package ro.telacad.ktplayground.basics.functions

fun printPersonDetails(
    name: String,
    address: String = "",
    phone: String
) {
    println("Name: $name, Address: $address, phone: $phone")
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
//    printPersonDetails("New York City", "John")
    printPersonDetails(phone = "09001", name = "John Doe")

    val list = listOf(1, 2, 3, 4, 5)
    println(
        joinToString(
            collection = list,
            separator = "; ",
            prefix = "(",
            postfix = ")"
        )
    )
}