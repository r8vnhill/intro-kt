package cl.ravenhill

private val _party: MutableList<String> = mutableListOf("Balthier", "Vaan")

val party: List<String>
    get() = _party

fun main() {
    println("Current party members: $party")

    // Adding a new member to the party
    _party.add("Fran")
    println("Updated party members: $party")

    // Attempting to modify the party directly will not work
    // party.add("Penelo") // This line would cause a compilation error
}
