
fun main(): Unit {
    /*
     * Working with collections
     */

    val readOnlyList = listOf(1, 2, 3)
    val readOnlySet = setOf(3, 4, 5)
    val readOnlymap = mapOf(1 to "a", 2 to "b")

    val mutableList = mutableListOf(43, 23, 12)
    val mutableMap = mutableMapOf(1 to "first", 2 to "second", 3 to "third")
    val mutableSet = mutableSetOf(8, 7, 6)

    println(readOnlyList.size)
    println(mutableList.size)

    println("isempty and isnotempty method------------")
    println(mutableSet.isEmpty())
    println(readOnlySet.isNotEmpty())

    println("printing list------------")
    for (element in readOnlySet) {
        println(element)
    }

    mutableMap.forEach {key, value -> println(value) }

    println("first method------------")
    println(readOnlyList.first())
    println(mutableSet.first())

    println("take method------------")
    println(mutableList.take(3))
    println(readOnlySet.take(2))

    println("filter method------------")
    println(mutableMap.filter { entry -> entry.key < 2})
    println(readOnlySet.filter { value -> value > 1})

    val languages = mapOf(
        "Kotlin" to 2,
        "Java" to 1,
        "C++" to 3,
        "Javascript" to 4,
        "Python" to 5
    )
    println(languages.filter { it.value<= 4 })
    println(languages.filter { it.value<= 4 }
        .map { it.key }
        .sorted())
}