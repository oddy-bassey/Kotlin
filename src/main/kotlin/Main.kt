
fun main(): Unit {
    val message = try {
        throw IllegalStateException()
        "the value is ${100 / 0}"
    } catch (error: IllegalStateException) {
        "An illegal state exception occurred"
    } catch (error: ArithmeticException) {
        "An arithmetic exception occurred"
    }

    println(message)
}
