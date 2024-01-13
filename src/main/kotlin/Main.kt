/*
 * For loop using infix functions like:
 * - until
 * - downTo
 * - step
 * - in
 */
fun main(): Unit {
    println("Arrays")

    val numbers = arrayOf(1, 2, 3, null)
    val nullArray = arrayOfNulls<Int>(5)
    val custom = Array(5) {index -> index}

    val size = numbers.size
    val value1 = numbers.get(1)
    val value2 = nullArray[0]
    nullArray.set(0, 21)
    numbers[3] = 32

    val array2 = intArrayOf(1, 2, 3, 4, 5)
    val primitiveShort = ushortArrayOf(1u, 2u, 3u, 4u)

    for(i in 0 until array2.size) {
        println(array2[i])
    }
    println("Second ---------------- ")
    for(element in primitiveShort) {
        println(element)
    }
    println("Third ---------------- ")
    nullArray.forEach { element -> println(element) }

    println("Fourth ---------------- ")
    greeting("Hello:)", "David", "Solomon", "Sasa")
}

fun greeting(greeting: String, vararg names: Any) {
    for(name in names) {
        println("$greeting, $name")
    }
}