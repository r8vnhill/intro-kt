@file:Suppress("ObjectPropertyName")

package cl.ravenhill

/***********************************************************************************************************************
 * Demonstrates the use of encapsulation to expose a read-only view of a mutable list.
 *
 * The `_party` list is privately mutable, allowing internal modifications, while the public `party`
 * property exposes it as an immutable list to prevent external modification.
 *
 * This pattern is commonly used to protect the integrity of internal collections in Kotlin.
 **********************************************************************************************************************/

/**
 * Represents a privately mutable list of party members, intended for internal manipulation within the program.
 *
 * This variable is used to store the current party configuration in the form of a mutable list. While it can be
 * modified internally, it is encapsulated and only exposed to external components as an immutable view through a
 * corresponding `party` property. This ensures that the integrity of the list is preserved and protects it from
 * unintended external modifications.
 */
private val _party: MutableList<String> = mutableListOf("Balthier", "Vaan")

/**
 * Read-only access to the current party members.
 *
 * Exposes `_party` as an immutable list, so clients cannot modify it directly.
 */
val party: List<String>
    get() = _party

fun main() {
    // Prints the initial party members
    println("Current party members: $party")

    // Internal code can safely mutate _party
    _party.add("Fran")
    println("Updated party members: $party")

    // External code cannot modify the party directly due to encapsulation
    // The following line would result in a compilation error:
    // party.add("Penelo")
}
