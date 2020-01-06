package ro.telacad.ktplayground.basics.functions

import java.lang.IllegalArgumentException

class User(
    val id: Int,
    val name: String,
    val address: String
)

fun saveUser(user: User) {

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