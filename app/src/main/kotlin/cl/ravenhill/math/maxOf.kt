package cl.ravenhill.math

/**
 * Returns the greater of two integer values.
 *
 * This function compares two integers and returns the one with the larger value.
 * It uses a concise expression body for clarity and brevity.
 *
 * ## Usage:
 * ```kotlin
 * val max = maxOf(10, 7)
 * println(max) // Output: 10
 * ```
 *
 * @param a The first integer to compare.
 * @param b The second integer to compare.
 * @return The greater of [a] and [b].
 */
fun maxOf(a: Int, b: Int) = if (a > b) a else b
