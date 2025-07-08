package cl.ravenhill

var difficultyLevel: String = "normal"
    private set(value) {
        require(value in listOf("easy", "normal", "hard")) {
            "Difficulty level must be one of: easy, normal, hard."
        }
        field = value
    }

fun main() {
    println("Current difficulty level: $difficultyLevel")

    // Example of setting a valid difficulty level
    difficultyLevel = "hard"
    println("Updated difficulty level: $difficultyLevel")

     difficultyLevel = "extreme" // This will fail validation
}
