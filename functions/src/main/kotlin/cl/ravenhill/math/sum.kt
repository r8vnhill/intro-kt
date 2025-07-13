package cl.ravenhill.math

/**
 * Sums all the integers provided as arguments.
 *
 * This function accepts a variable number of integer arguments and returns their sum.
 * If no arguments are provided, it returns 0.
 *
 * ## Usage:
 * ```kotlin
 * sumAll() // 0
 * sumAll(1, 2, 3) // 6
 * ```
 *
 * @param nums A variable number of integers to sum.
 * @return The sum of all provided integers.
 */
fun sumAll(vararg nums: Int): Int =
    nums.sum()

/**
 * Sums the first integer with the rest of the values provided.
 *
 * This function is useful when you want to require at least one argument.
 * The sum starts with [first] and continues with the values in [rest].
 *
 * ## Usage:
 * ```kotlin
 * sumTo(10, 20, 30) // 60
 * sumTo(first = 100, rest = intArrayOf(200, 300)) // 600
 * ```
 *
 * @param first The initial value to start the sum.
 * @param rest Additional integers to add to the sum.
 * @return The total sum of [first] and all values in [rest].
 */
fun sumTo(first: Int, vararg rest: Int): Int =
    rest.fold(first) { acc, i -> acc + i }

/**
 * Demonstrates how to use [sumAll] and [sumTo] with various inputs.
 */
fun main() {
    println("Sum of [] = ${sumAll()}")
    // Output: Sum of [] = 0

    println("Sum of 1, 2, 3, 4, 5 = ${sumAll(1, 2, 3, 4, 5)}")
    // Output: Sum of 1, 2, 3, 4, 5 = 15

    val extras = intArrayOf(6, 7, 8)
    println("Sum of 1, 2, 3, 4, 5, 6, 7, 8 = ${sumAll(1, 2, 3, 4, 5, *extras)}")
    // Output: Sum of 1, 2, 3, 4, 5, 6, 7, 8 = 36

    println("Sum of 10, 20, 30 = ${sumTo(10, 20, 30)}")
    // Output: Sum of 10, 20, 30 = 60

    println("Sum of 100, 200, 300, 400 = ${sumTo(first = 100, rest = intArrayOf(200, 300, 400))}")
    // Output: Sum of 100, 200, 300, 400 = 1000
}
