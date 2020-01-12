package ro.telacad.ktplayground.basics.nullableandexceptions

import java.lang.Exception
import java.lang.RuntimeException

class CustomException(
    override val message: String?
) : Exception(message)

fun anExceptionalFunction(message: String?) {
    println("... some complex business logic")
    throw CustomException(message)
    println("... more complex business logic")
}

fun anExceptionalFunction2(message: String?): Int {
    throw CustomException(message)
}

fun main() {

    // 1. throwing an exception by using `throw`
//    throw CustomException("My custom exception")

    // 2. handling exceptions
    try {
        anExceptionalFunction("Some exceptional value")
    } catch (customException: CustomException) {
        println("I catch the exception!")
    } catch (runtimeException: RuntimeException) {
        println("I catch a runtime exception!")
    }

    // 3. try-catch expression
    val something: Int = try {
        anExceptionalFunction2("Some exceptional value")
    } catch (ex: CustomException) {
        0
    }

    println("Something is $something")
}