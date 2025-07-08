package cl.ravenhill

var version: String = "1.0.0"
    set(value) {
        require(Regex("""\d+\.\d+\.\d+""").matches(value)) {
            "Version must be in the format X.Y.Z where X, Y, and Z are integers."
        }
        field = value
    }

fun main() {
    println("Current version: $version")

    // Example of setting a valid version
    version = "1.2.3"
    println("Updated version: $version")

    // Uncommenting the next line will throw an exception due to invalid format
     version = "1.2" // This will fail validation
}
