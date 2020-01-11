package ro.telacad.ktplayground.basics.functions

import java.lang.IllegalArgumentException

class User(
    val id: Int,
    val name: String,
    val address: String
)

fun saveUser(user: User) {

    /**
     * The validate function is a local function in the scope of saveUser function.
     *
     * We must be aware that local functions are compiled as Function objects, so
     * each time we define a local function, the bytecode that will be generated
     * will produce a Function object which will be allocated in the memory of the application.
     */

    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save the user: $user to the database! " +
                        "The provided $fieldName has invalid value: $value"
            )
        }
    }

    if (user.id == 0) {
        throw IllegalArgumentException("Can't save the user: $user to the database! The provided id is not valid!")
    }

    validate(user, user.name, "name")
    validate(user, user.address, "address")


    // save to the database
}

fun main() {

}