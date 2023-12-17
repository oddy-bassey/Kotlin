/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

/*
 * Function Parameters
 * supports default arguments and name parameters which allow us to
 * specify which parameter we're providing actual values for
 *
 * Note: a Unit return type is an insignificant return type in Kotlin
 * The use of Unit is particularly relevant when you want to indicate that a function
 * has a side effect (like printing to the console or modifying external state) but
 * doesn't produce a result that needs to be used.
 */
fun main(): Unit {
    fun printGreeting(
        greeting: String = "Hi there",
        name: String = "Oddy",
        age: Int = 27
    ) = "$greeting, I'm $name and I am $age years old."

    println(printGreeting(name = "Bassey Oddy")) // using named arguments
}