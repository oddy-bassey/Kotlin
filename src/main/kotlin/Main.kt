
/* Companion Object
 * A companion object is an object decoration within a class
 * They are most useful in organising methods and properties so they
 * re only accessible by first referencing an enclosing class name.
 *
 * NOTE:
 * when deciding between a companion object or top level property or
 * function, consider whether or not the function should be globally
 * available or whether it makes more sense within a context of another
 * explicit class.
 */
fun main(): Unit {

    val controller = SearchController.create("Kotlin")
    // or
    val controller2 = SearchController.Companion.create("Java")
}