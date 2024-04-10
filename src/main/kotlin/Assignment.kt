import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

private suspend fun loadItemsFromDB(): List<String> {
    delay(5000)
    return listOf("Java", "Kotlin", "C++")
}

private suspend fun loadItemsFromNetwork(): List<String> {
    delay(5000)
    return listOf("Python", "JavaScript", "Groovy")
}

/*
 * use async() to parallelize the execution of the two provided suspend functions
 * use await() to get results of both async() calls
 * convert the results into a unified list and print out to the console
 */
fun main(): Unit = runBlocking {
    val db = async { loadItemsFromDB() }
    val network = async { loadItemsFromNetwork() }

    val results = db.await() + network.await()

    results.forEach{
        println(it)
    }
}