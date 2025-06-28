package cl.ravenhill.user

fun showMessage(isLoggedIn: Boolean) {
    if (isLoggedIn) {
        println("Welcome back!")
    } else {
        println("Please sign in.")
    }
}
