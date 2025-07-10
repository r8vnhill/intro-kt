package cl.ravenhill.basics

/**
 * Packs a list of book weights into boxes with a maximum weight of 20 kg each.
 *
 * Books are added one by one to the current box until the next book exceeds the 20 kg limit.
 * At that point, a new box is started.
 *
 * ## Usage:
 * This function returns a list where each element represents the number of books packed in a given box, preserving the
 * order of the input list.
 *
 * ### Example:
 * ```kotlin
 * packBooks(listOf(5, 7, 4, 6, 3, 8, 1)) // Returns: [3, 4]
 * ```
 *
 * @param books A list of book weights in kilograms.
 * @return A list indicating how many books are packed in each box.
 */
fun packBooks(books: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var currentWeight = 0
    var count = 0

    for (book in books) {
        if (currentWeight + book > 20) {
            result.add(count)
            currentWeight = 0
            count = 0
        }
        currentWeight += book
        count++
    }

    if (count > 0) {
        result.add(count)
    }

    return result
}

fun main() {
    val packedBooks = packBooks(listOf(5, 7, 4, 6, 3, 8, 1))
    println("Packed books: $packedBooks") // Output: Packed books: [3, 4]
}
