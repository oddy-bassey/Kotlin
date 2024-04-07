
fun main(): Unit {
    ListUtils.nonEmptyList(arrayOf(1, 2, 4, 5))
    ListUtils.setToNonEmptyList(setOf("a", "b", "d", "c"))

    // replacement
    arrayOf(1, 2, 4, 5).nonEmptyList()
    setOf("a", "b", "d", "c").toNonEmptyList()
}
