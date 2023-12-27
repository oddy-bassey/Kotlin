
fun main(): Unit {
    val value: Any = "32"

    checkTypeWithIf(value)
    checkInputWithWhen(null)
}

fun checkTypeWithIf(input: Any?) {
     if (input is String) {
         if (input == null) {
             println("input string is null")
         } else {
             println("input is a String with length ${input.length}")
         }
     }

    if (input is Int) {
        println("input is an Int")
    }
}

fun checkInputWithWhen(input: Any?) {
    when (input) {
        null -> println("input is a null value")
        is String -> println("input is a String with length ${input.length}")
        is Int -> println("input is an Int")
    }
}