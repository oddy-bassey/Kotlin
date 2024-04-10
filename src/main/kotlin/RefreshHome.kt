import kotlinx.coroutines.*

private suspend fun refreshTasks() {
    delay(3000)
    println("refreshing tasks on ${Thread.currentThread().name}")
}
private suspend fun refreshReservation() {
    delay(3000)
    println("refreshing reservations on ${Thread.currentThread().name}")
}
private fun refreshUser() {
    println("refreshing user on ${Thread.currentThread().name}")
}
private fun updateUI() {
    println("updating UI on ${Thread.currentThread().name}")
}
private fun cancelJobs(vararg jobs: Job) {
    jobs.forEach {
        it.cancel()
        println("${Thread.currentThread().name} job cancelled")
    }
}

/* Working with coroutines
 * Note:
 * - Code within a coroutine runs sequentially and a delay in a coroutine
 *   does not hinder/block the underlying thread.
 * - Whether we start a coroutine using lunch or async, we can cancel
 *   that coroutine and it's children by calling cancel on that coroutine's
 *   job.
 * - a Job is a part of a coroutine's scope and can be used to remember a
 *   coroutine and cancel it.
 */

fun main(): Unit = runBlocking {

    /* running the refresh calls in an async coroutine which suspends the
     * results until it is available (async coroutine is done executing)
     * this facilitates parallel execution of both coroutines
     */
    val task1 = async { refreshTasks() }
    val task2 = async { refreshReservation() }

    awaitAll(task1, task2)
    withContext(this@runBlocking.coroutineContext) {
        updateUI()
    }
    val job = launch { refreshUser() }
    job.cancel()
}
