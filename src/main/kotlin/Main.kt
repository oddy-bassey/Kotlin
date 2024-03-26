import javax.annotation.processing.Messager
import kotlin.random.Random

/* Extension functions
 */
fun main(): Unit {
    when (val result = getString()) {
        is StringResult.Success -> println(result.value)
        is StringResult.Error -> println("There was an error :[ !!")
    }
}

fun getRandomString(): String {
    val rand = Random.nextInt(10)

    if (rand > 5) {
        throw IllegalStateException()
    } else {
        return rand.toString()
    }
}

fun getString(): StringResult {
    return try {
        StringResult.Success(getRandomString())
    } catch (error: Throwable) {
        StringResult.Error(error)
    }
}
