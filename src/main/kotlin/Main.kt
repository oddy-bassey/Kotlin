/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

fun main(): Unit {
    val message1 = getMessageWithIf(32)
    println(message1)

    val message2 = getMessageWithWhen(85)
    println(message2)
}

fun getMessageWithIf(value: Int) = if (value>50) {
    "pipeline is overloaded"
} else {
    "pipeline in stable condition"
}

fun getMessageWithWhen(value: Int) =  when {
    value > 50 -> "pipeline overload"
    else -> "pipeline in stable condition"
}