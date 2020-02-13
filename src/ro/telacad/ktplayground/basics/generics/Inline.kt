package ro.telacad.ktplayground.basics.generics

inline fun <T> genericInlinedFunction(t: T): T {
    println("Inside the inlined function")
    return t
}

fun <T> genericNotInlinedFunction(t: T): T {
    println("Inside the non-inlined function")
    return t
}

inline class Username(val value: String)
inline class Password(val value: String)

fun safeLogin(username: Username, password: Password) {
    println("Login with Username: ${username.value} and Password: ${password.value}")
}

fun login(username: String, password: String) {
    println("Login with Username: $username and Password: $password")
}

fun main(args: Array<String>) {

    genericInlinedFunction("something")

    genericNotInlinedFunction("somethingElse")

    val username = "bogdan.dina"
    val password = "root123"

    login("bogdan.dina", "root123")

    // Invalid login calls
    login("root123", "bogdan.dina")
    login(password, username)

    // Valid and safe login call
    safeLogin(Username(username), Password(password))
}