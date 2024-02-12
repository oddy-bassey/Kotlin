
fun main(): Unit {
    /*
     * Sequences
     * what they are?
     * when to use it?
     */

    /*
     * Sequences are iterable container providing much the same functionalities as iterable
     * which is what backs most of our common collection types but sequences have different
     * performance traits. Rather than eagerly applying a transformation to every item in
     * the iterable container, sequences apply all processing steps to each individual item.
     *
     * you can think of a sequence as a depth-first approach while iterables are a breadth-first
     * approach
     */

    val languages = listOf("Kotlin", "C++", "Java")
        .filter { it.length >1 }
        .map { it.length }

    println(languages)

    val languageSequence = sequenceOf("Java", "Kotli", "C++", "Python")
    val fromIterable = listOf(213, 43, 35, 54).asSequence()
    languageSequence.filter { it.length > 4}
        .map { it.length }
        .take(2)
}