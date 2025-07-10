package cl.ravenhill.basics

fun main() {
    println("for loop")

    // Iterates from 1 to 5 (inclusive)
    print("1..5\n> ")
    for (i in 1..5) {
        print(i)
    }

    // Iterates from 5 down to 1 (inclusive)
    print("\n5 downTo 1\n> ")
    for (i in 5 downTo 1) {
        print(i)
    }

    // Iterates from 1 to 5 (inclusive), skipping every 2nd element
    print("\n1..5 step 2\n> ")
    for (i in 1..5 step 2) {
        print(i)
    }

    // Iterates from 1 up to (but not including) 5 using the '..<' operator
    print("\n1..<5\n> ")
    for (i in 1..<5) {
        print(i)
    }

    // Equivalent to the previous loop using the 'until' keyword
    print("\n1 until 5\n> ")
    for (i in 1 until 5) {
        print(i)
    }

    // Iterates over characters from 'a' to 'e' (inclusive)
    print("\n'a'..'e'\n> ")
    for (c in 'a'..'e') {
        print(c)
    }

    // Iterates over characters from 'e' down to 'a' (inclusive)
    print("\n'e' downTo 'a'\n> ")
    for (c in 'e' downTo 'a') {
        print(c)
    }

    // Iterate over an iterable collection
    println("\n\nHomunculi:")
    val sins: Iterable<String> = listOf("Lust", "Gluttony", "Envy", "Greed", "Wrath", "Sloth", "Pride")
    for (sin in sins) {
        println("> Homunculus: $sin")
    }
}
