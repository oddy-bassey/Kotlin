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

fun printFormattedName (firstname: String,
            lastname: String,
            formatter: (String, String) -> String) {

    println(formatter(firstname, lastname))
}

val basicFormatter: (String, String) -> String = {
    firstname, lastname ->
    "$lastname $firstname"
}

val fancyFormatter: (String, String) -> String = {
        firstname, lastname ->
    "My name is $firstname $lastname"
}

fun main(): Unit {
    printFormattedName("Oddy", "Bassey", basicFormatter)

    printFormattedName("Oddy", "Bassey", fancyFormatter)

    printFormattedName("Oddy", "Bassey") {
            firstname, lastname ->
        "$firstname $lastname"
    }
}