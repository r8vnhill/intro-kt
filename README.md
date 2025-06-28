# 🚀 intro-kt — A Pragmatic Introduction to Kotlin

![Kotlin](https://img.shields.io/badge/kotlin-2.2.0-7F52FF?logo=kotlin)
![Gradle](https://img.shields.io/badge/build%20tool-gradle-02303A?logo=gradle)
![License](https://img.shields.io/badge/license-BSD--2--Clause-blue.svg)
![Platform](https://img.shields.io/badge/platform-JVM-orange)
![Status](https://img.shields.io/badge/status-educational-lightgrey)

This repository accompanies the lesson [**“Kotlin: A Pragmatic and Modern Language”**](https://dibs.ravenhill.cl/docs/type-fundamentals/basics/intro-kotlin), part of the DIBS course on *software library design and development*.
It provides a minimal Kotlin project scaffolded with **Gradle**, intended to help you explore the basics of the Kotlin language.

>[!note]
> The lessons are in spanish, but the code examples and project structure are in English.

## 📦 Project Overview

Kotlin is a modern, expressive, and safe programming language developed by JetBrains.  
In this lesson, you’ll explore Kotlin’s foundations as a tool for building **reusable**, **maintainable**, and **multiplatform** libraries.

## 🧑‍💻 Getting Started

### Requirements

- Java 11 or newer
- [Gradle](https://gradle.org/) (optional, a wrapper is included)
- An IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) is recommended

### Clone the repository

```bash
git clone https://github.com/r8vnhill/intro-kt.git
cd intro-kt
```

### Run the application

Use Gradle to build and run the app:

```bash
./gradlew :app:run
```

This will execute the main Kotlin file and print a message to the terminal.

### Explore and modify

Open the file `app/src/main/kotlin/org/example/App.kt` and modify the greeting to make it your own:

```kotlin
class App {
    val greeting: String
        get() = "Hello, Kotlin world!"
}
```

You can also replace the whole structure with a simple function:

```kotlin
fun main() {
    println("The cake is a lie.")
}
```

## 🗂️ Project Structure

```
intro-kt/
├── app/
│   ├── build.gradle.kts       # Application module build file
│   └── src/
│       └── main/
│           └── kotlin/
│               └── org/example/App.kt
├── build.gradle.kts           # Root project build file
├── gradlew / gradlew.bat      # Gradle wrappers
└── settings.gradle.kts        # Module settings
```

## 🤝 Contributing

This repository is primarily educational and not actively maintained as a collaborative project.  
However, if you spot a mistake, want to suggest an improvement, or have a question:

- Feel free to [open an issue](https://github.com/r8vnhill/intro-kt/issues).
- Please review our [Code of Conduct](CODE_OF_CONDUCT.md) to ensure a respectful and inclusive space.

You're also welcome to fork the project and adapt it for your own learning or teaching purposes!

## License

This project is licensed under the [BSD 2-Clause License](LICENSE).
