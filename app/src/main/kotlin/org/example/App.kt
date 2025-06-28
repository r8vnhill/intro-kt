package org.example

class App {
    val greeting: String
        get() = "Ladies and Gentlemen, I give you Rose Red's killer..."
}

fun main() {
    println(App().greeting)
}
