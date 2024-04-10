import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch { println("Hello, I'm a running Coroutine!") }
}
