package cl.ravenhill.basics

import kotlin.random.Random

/**
 * Generates a random letter from the Latin alphabet.
 *
 * The result is a character selected randomly from the ranges `'a'..'z'` and `'A'..'Z'`.
 *
 * @return A randomly selected letter.
 */
private fun randomChar(): Char {
    val alphabet = ('a'..'z') + ('A'..'Z') // List of lowercase and uppercase letters
    return alphabet.random()
}

/**
 * Generates a random string of alphabetic characters.
 *
 * The resulting string has a random length between 10 and 30 characters and is composed of randomly chosen letters.
 *
 * @return A randomly generated string.
 */
fun randomString(): String =
    (1..Random.nextInt(10, 30))         // Generate a random length between 10 and 30
        .map { randomChar() }           // Create a list of random characters
        .joinToString("")               // Concatenate them into a single string

/**
 * Demonstrates the use of range checks (`in`, `!in`) for numbers, characters, strings, and collections.
 */
fun main() {
    val x = Random.Default.nextInt(30) // Random integer between 0 and 29
    println("x = $x")

    // Check if x is in the range 1 to 10 (inclusive)
    if (x in 1..10) {
        println("$x is between 1 and 10")
    }

    // Check if x is NOT in the range 20 to 30 (inclusive)
    if (x !in 20..30) {
        println("$x is not between 20 and 30")
    }

    // Use of 'when' with range conditions
    when (x) {
        in 1..10 -> println("$x is in the range 1 to 10")
        !in 100..200 -> println("$x is not in the range 100 to 200")
        else -> println("Uncontemplated case for $x")
    }

    // Generate a random lowercase character
    val c = (Random.Default.nextInt(26) + 'a'.code).toChar()
    if (c in 'a'..'z') {
        println("$c is a lowercase letter")
    }

    // Check if a random string is lexicographically in a given range
    val s = randomString()
    if (s in "Gojira".."Savatage") {
        println("$s is in the range \"Gojira\" to \"Savatage\"")
    }

    // Check for string membership in a list
    val songs = listOf("Perfect Day", "Walk on the Wild Side", "Satellite of Love")
    if ("Perfect Day" in songs) {
        println("🎵 Lou Reed is in the playlist.")
    }
}
