import javax.annotation.processing.Messager

/* Extension functions
 */
fun main(): Unit {
    enhanceMessage("God is good and great") {
        println(it)
        add(12, 54)
    }
}

// val lambdaName : Type = {parameterList -> codeBody}
val add: (Int, Int) -> Int = {a,b -> a + b}

fun enhanceMessage(message: String, funAsParam: (String) -> Int) {
    println("$message ${funAsParam("Hey")}")
}