
fun main(): Unit {
    /*
     * Sequences?
     * These are types that provide similar features to other collections but
     * processes data in a lazy and efficient manner
     *
     * when to use it?
     * This lazy approach can be useful for processing collections, especially
     * when working with large amounts of data
     */
    val languages = listOf("Kotlin", "C++", "Java")
        .filter { it.length > 4 }
        .map { it.length }

    // creating a sequence
    val languageSequence = sequenceOf("Rust", "Python", "Javascript")
    val fromIterable = listOf(1, 2, 3).asSequence();
    languageSequence.filter { it.length > 4 }.map { it.length }.take(2)

    languageSequence.forEach { println(it) }
}