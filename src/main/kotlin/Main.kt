/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

fun main(): Unit {
    if (true) println("")

    var age: Int = 43

    if (age < 40) {
        println("you are a young person")
    }else if (age > 40 && age < 55) {
        println("you are a middle aged person")
    } else {
        println("you are an elderly person")
    }

    when {
        age < 20 -> println("a child")
        age in 20..40 -> println("young person")
        age in 40..55 -> println("middle aged person")
        else -> println("elderly person")
    }

    when (age) {
        43 -> println("this man")
        in 20..40 -> println("young person")
        55 -> println("middle aged person")
    }
}