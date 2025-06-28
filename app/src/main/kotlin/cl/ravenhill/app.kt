package cl.ravenhill

data class TwentiethCenturyBook(val title: String, val author: String, val year: Int) {
    init {
        require(year in 1900..1999) {
            "Only books published between 1900 and 1999 are allowed. Received: $year"
        }
    }

    constructor(title: String, year: Int) : this(title, "Unknown", year) {
        println("No author provided — using 'Unknown'.")
    }
}

fun main() {
    val book1 = TwentiethCenturyBook("The Hobbit", "J. R. R. Tolkien", 1937)
    println("Book 1: $book1")

    val book2 = TwentiethCenturyBook("The Shadow Over Innsmouth", "H. P. Lovecraft", 1936)
    println("Book 2: $book2")

    val book3 = TwentiethCenturyBook("Primary Colors", 1996)
    println("Book 3: $book3")

    val book4 = TwentiethCenturyBook("Fire & Blood", "George R. R. Martin", 2018)
    println("Book 4: $book4")
    """\d+\.\d+\.\d+""".toRegex().matches("19.3.7")
}
