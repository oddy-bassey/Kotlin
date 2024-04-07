fun <T> Array<T>.nonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmpty List must have at least one item!"
    }
    return toList()
}
fun <T> Set<T>.toNonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmpty List must have at least one item!"
    }
    return toList()
}

class ListUtils {
    /* Refactor the methods to top-level extension functions on List<T>
     * Once the functions are converted, the listUtils class shouldn't be needed
     */

    companion object {
        fun <T> nonEmptyList(vararg items: T): List<T> {
            check(items.isNotEmpty()) {
                "NonEmpty List must have at least one item!"
            }
            return items.toList()
        }

        fun <T> setToNonEmptyList(set: Set<T>): List<T> {
            check(set.isNotEmpty()) {
                "NonEmpty List must have at least one item!"
            }
            return set.toList()
        }
    }
}