package cl.ravenhill.math

/**
 * Adds two integers and returns the result.
 *
 * Performs a simple integer addition between the two provided arguments.
 *
 * ## Usage:
 * Useful for basic arithmetic operations where two integer values need to be summed.
 *
 * ### Example:
 * ```kotlin
 * val result = add(791, 245) // result == 1036
 * ```
 *
 * @param a The first integer to add.
 * @param b The second integer to add.
 * @return The sum of `a` and `b`.
 */
fun add(a: Int, b: Int): Int =
    a + b

fun main() {
    println("848 + 391 = ${add(848, 391)}")
    // Output: 848 + 391 = 1239
}
