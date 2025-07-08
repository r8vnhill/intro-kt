package cl.ravenhill

/**
 * Holds the current version of the application or module.
 *
 * The version must follow the semantic versioning format `X.Y.Z`, where X, Y, and Z are integers.
 * Attempting to assign a value that doesn't match this format will result in an `IllegalArgumentException`.
 */
var version: String = "1.0.0"
     set(value) {
        // Validate that the input matches the semantic versioning pattern
        require(Regex("""\d+\.\d+\.\d+""").matches(value)) {
            "Version must be in the format X.Y.Z where X, Y, and Z are integers."
        }
        // If valid, assign the new value to the backing field
        field = value
    }

fun main() {
    // Print the initial version
    println("Current version: $version")

    // Set a valid version
    version = "1.2.3"
    println("Updated version: $version")

    // Attempting to set an invalid version.
    // This will throw an IllegalArgumentException due to an incorrect format
    version = "1.2" // This will fail validation
}
