/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

fun main(args: Array<String>) {
    val num1: Int = 23 // 32bits
    val num3: Byte = 2 // 8bits
    val num4: Short = 4 // 16bits
    val num5: Long = 33 // 64bits

    val num2 = 78 // (type inference) inferred as Int
    val num6 = 100000000000 // type inference, inferred as Long

    val num7 = 10L
    val num8: UInt = 21u
    val num9: ULong = 23UL

    val num10 = 6.45 // inferred to Double
    val num11 = 3.3f // inferred to Float

    // Numeric type conversion
    println(233.4.toInt())
    println(233.4.toFloat())
    println(233.654.toULong())
    println(100_000_000.toByte())
    println(123_456_789.toByte())
}