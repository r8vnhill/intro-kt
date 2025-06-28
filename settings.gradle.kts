plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

// Set the root project name
rootProject.name = "intro-kt"

// Include the main application module
include("app")
