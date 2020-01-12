package ro.telacad.ktplayground.basics.collections

import java.util.ArrayList
import java.util.HashMap

fun main() {

    // 1. Mutable and Read-only collections

    // 2. How to instantiate collections ?

    // read only collections

    val listOfNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 5)
    println(listOfNumbers)
    val setOfNumbers: Set<Int> = setOf(1, 2, 3, 4, 5, 5)
    println(setOfNumbers)

    val mapOfNumbers: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(mapOfNumbers)

    // mutable collections
    val mutableListOfNumbers = mutableListOf(1, 2, 3, 4, 5, 5)
    println(mutableListOfNumbers)
    val mutableSetOfNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 5)
    println(mutableSetOfNumbers)

    val mutableMapOfNumbers: MutableMap<Int, String> = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(mutableMapOfNumbers)

    val aList = ArrayList<Int>()
    val aSet = HashSet<String>()
    val aMap = HashMap<String, Int>()

    // 3. Add elements to collections

    println("A list: $aList")
    println("A Set: $aSet")
    println("A map: $aMap")

    // for MutableList and MutableSet use add()
    aList.add(10)
    aSet.add("Ten")

    // for MutableMap use put()
    aMap.put("Ten", 10)

    println("A list: $aList")
    println("A Set: $aSet")
    println("A map: $aMap")

    // 4. Updating collection elements

    // For MutableList use set()

    aList.set(0, 11)
    println("The list after updating $aList")

    // For MutableMap use indexing operator
    aMap["Ten"] = 11
    println("The map after updating $aMap")

    // 5. Removing collection elements - use the remove() function - use remove() function

    aList.remove(11)
    println("The list after removing $aList")
    aSet.remove("Ten")
    println("The set after removing $aSet")
    aMap.remove("Ten")
    println("The map after removing $aMap")

}