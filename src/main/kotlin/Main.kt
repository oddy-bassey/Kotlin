/*
 * For loop using infix functions like:
 * - until
 * - downTo
 * - step
 * - in
 */
fun main(): Unit {
    println("For Loop")

    for(counter in 0 until 5) println(counter)
    println()
    for(counter in 10 downTo 0) println(counter)
    println()
    for(counter in 10 downTo 0 step 2) println(counter)
    println()
    for(counter in 20 .. 30) println(counter)
}
