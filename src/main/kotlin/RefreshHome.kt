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
 * Code within a coroutine runs sequentially and a delay in a coroutine
 * does not hinder/block the underlying thread
 */

fun main(): Unit = runBlocking {

    /* this executes refreshTasks and refreshReservation in a coroutine
     * running on the main thread
     */
    launch {
        refreshTasks()
        refreshReservation()
    }
    refreshUser()
}
