package cl.ravenhill

/**
 * Represents the current difficulty level of the application or game.
 *
 * Only three difficulty levels are allowed: "easy", "normal", and "hard".
 * Any attempt to set an invalid value will result in an `IllegalArgumentException`.
 *
 * The setter is private, which means the difficulty level can only be modified from within this file.
 */
var difficultyLevel: String = "normal"
    private set(value) {
        // Ensure the new value is one of the allowed options
        require(value in listOf("easy", "normal", "hard")) {
            "Difficulty level must be one of: easy, normal, hard."
        }
        // If the value is valid, assign it to the backing field
        field = value
    }

fun main() {
    // Display the initial difficulty level
    println("Current difficulty level: $difficultyLevel")

    // Set a valid difficulty level
    difficultyLevel = "hard"
    println("Updated difficulty level: $difficultyLevel")

    // Attempting to set an invalid level
    difficultyLevel = "extreme" // This will fail validation
}
