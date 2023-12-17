/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

fun main(args: Array<String>) {
    var nullableString: String? = null // non-nullable variable

    /*
     * asserts value is not null before accessing it else it throws an exception
     */
    println(nullableString!!.length)

    /*
     * Safe call operator (?.)
     * It safely accesses properties or methods of an object by avoiding
     * null-pointer exceptions. If the value isn't present it returns null
     *
     * Elvis operator (?:)
     * This is also used with the safe-call operator to return a default value
     * if the expression evaluates to null
     */
    println(nullableString?.length)
    println(nullableString?.length ?: "Value is null")
}