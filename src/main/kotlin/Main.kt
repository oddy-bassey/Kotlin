/* Note:
 * By default Integer types that fit within 32 bits will
 * have an inferred type of Int but if it's larger than
 * 32bits then it's inferred as Long
 *
 * The inferred type of floating point number will be a Double
 */

/*
 * Higher-order function
 * this is a function that can take other functions as
 * a parameter or return them
 */

fun printAreaOfRectangle(length: Int, breadth: Int, calcArea: (Int, Int) -> Int) {
    println("The area of the rectangle is ${calcArea(length, breadth)}")
}

fun main(): Unit {
    printAreaOfRectangle(6, 5, { length, breadth ->
        length * breadth
    })

    /*
     * Using trailing lambda syntax, the lambda in a parameter list
     * is moved outside the parenthesis of a function call when it is the
     * last parameter
     */
    printAreaOfRectangle(12, 5) { length, breadth ->
        length * breadth
    }
}