/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

fun main(args: Array<String>) {
    val aChar: Char = 'a'
    val numericChar = '1'
    val newlineChar = '\n'

    //val concatVal = 'a' + 'b' // character literals can not be concatenated
    //val concatVal = 'ab' // too many values in character literal

    val aString: String = "Hello Kotlin"
    val aString2 = "Hello \n World!!"
    print(aString2)

    val rawString = """
        Some
            multiline
        text
             with different
             >>formatting
        """".trimMargin(">>")

    print(rawString)

    val concatString = "Hello" + "there!!" // String concatenation
    val concatNumber = "It only " + 11
    println(concatNumber)

    val number = 834
    println("The number $number") // using string template
    println("The number ${number + 540}") // using string template with arithmetic

    println("Hi".isNotEmpty())
    println(" ".isNotEmpty())
    println("Hi".isNotBlank())
    println(" ".isNotBlank())
    println("Kotlin is a lovely JVM language ".contains("Kotlin"))
}