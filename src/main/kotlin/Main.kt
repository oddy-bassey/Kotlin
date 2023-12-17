/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

/*
 * By default, all functions are public (have public access modifier)
 * that is they're available to use within any file in the project
 * or in any project that depends on our project.
 */
fun main(args: Array<String>) {
    println("Hello World")
    printGreeting("Oddy Bassey")
}

fun printGreeting(name: String) {
    /* Local Function: A function defined inside another function
     * and not accessed outside of that function scope
     */
    fun getAddress() = "Uyo, Akwa-Ibom State"

    println("${getGreeting()} $name, and I'm ${getAge()} years old and i live in ${getAddress()}")
}

fun getGreeting(): String {
    return "Hi, I'm"
}

/* inferring function return type
 * the function is also known as a "Single Expression Function"
 */
fun getAge() = 27