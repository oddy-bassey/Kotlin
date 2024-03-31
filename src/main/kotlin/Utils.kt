

private val hoursInMins = 60 * 60 * 1000

// extension function
fun Int.millisForHours() = this * hoursInMins

fun <T> T.log() = println(this)


// extension properties
val Int.isEven: Boolean
    get() = this.mod(2) == 0

val Int.isOdd: Boolean
    get() {
        return this.mod(2) == 1
    }
