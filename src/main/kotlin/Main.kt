import javax.annotation.processing.Messager
import kotlin.random.Random

/* Extension function and extension properties
 * They allow developers to extend types they dont own, making it
 * easier to adapt types and APIs to fit your specific use cases
 * enclosing class
 */

fun main(): Unit {

    print(4.millisForHours())
    println(20.millisForHours())
    println("[abc]+".toRegex())

    println(4.isEven)
    println(7.isOdd)

    5.log()
    "sample data".log()
    listOf(12, 43, 2).log()
}
