
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

    // Assignment: identify the students with the lowest test scores
    val testScores = mapOf(
        "A" to 88.1,
        "B" to 88.9,
        "C" to 82.1,
        "D" to 72.1,
        "E" to 66.1,
        "F" to 89.1,
        "G" to 62.1,
        "H" to 85.7,
        "I" to 94.3,
        "J" to 83.8,
    )

    testScores.toList()
        .sortedBy { pair -> pair.second } // sort by test score
        .map { pair -> pair.first }
        .take(3)
        .forEach { println(it) }


}