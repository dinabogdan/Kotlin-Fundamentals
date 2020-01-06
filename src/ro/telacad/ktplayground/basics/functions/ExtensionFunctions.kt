package ro.telacad.ktplayground.basics.functions

/**
 * MutableList<String> = Receiver type
 * this                = Receiver object
 *
 * ExtensionFunctions is represented as a Java static function
 * where the first parameter of the function it's an instance
 * of a class on which the function was defined.
 *
 * eg: public static final void addOneAndPrintAll(@NotNull List $this$addOneAndPrintAll, @NotNull String item)
 */

fun MutableList<String>.addOneAndPrintAll(item: String) {
    this.add(item)
    for (i in this) {
        println(i)
    }
}

fun main() {
    val numbers: MutableList<String> = mutableListOf("One", "Two", "Three")
    numbers.add("Five")
    numbers.addOneAndPrintAll("Four")

}