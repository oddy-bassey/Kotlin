/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

var greetingFunction: () -> Unit = {
    println("Hello everyone :)")
}

var getTodayDate: (name: String) -> String = {
    "$it today is 17th December, 2023."
}

fun main(): Unit {
    greetingFunction()
    println(getTodayDate("Computer"))

    greetingFunction = {
        println("Kotlin is beautiful :)")
    }

    getTodayDate = {name ->
        "$name today is 17-Dec-2023."
    }

    greetingFunction.invoke();
    println(getTodayDate.invoke("Revolt"))
}