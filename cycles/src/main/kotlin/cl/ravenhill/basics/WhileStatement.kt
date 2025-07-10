package cl.ravenhill.basics

/**
 * Returns the first positive number from a list of integers.
 *
 * Iterates through the [inputs] list until it finds a number greater than 0.
 * If no positive number is found, it throws an [IndexOutOfBoundsException].
 *
 * ## Usage:
 * This function is useful when you need to extract the first valid (positive) input from a list of possibly invalid or
 * placeholder values.
 *
 * ### Example:
 * ```kotlin
 * val inputs = listOf(-2, 0, 5, 3)
 * val result = firstPositiveFrom(inputs) // returns 5
 * ```
 * @param inputs A list of integers to search.
 * @return The first positive number in the list.
 * @throws IndexOutOfBoundsException if the list contains no positive numbers.
 */
fun firstPositiveFrom(inputs: List<Int>): Int {
    var index = 0
    var number: Int

    // Repeat until a positive number is found or the list ends
    do {
        if (index >= inputs.size) {
            // No positive number was found
            throw IndexOutOfBoundsException("No positive number found in the list.")
        }
        number = inputs[index]
        index++
    } while (number <= 0)

    return number
}

/**
 * Demonstrates the use of [firstPositiveFrom] with a sample list.
 */
fun main() {
    val inputs = listOf(-3, -1, 0, 7, 4)
    println("First positive number: ${firstPositiveFrom(inputs)}")
}
