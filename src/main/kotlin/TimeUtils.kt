
private val hoursInMinsPrivate = 60 * 60 * 1000
val hoursInMins = 60 * 60 * 1000
fun millisForHours(hours: Int) = hours * hoursInMins
fun millisForHoursPrivatew(hours: Int) = hours * hoursInMinsPrivate
/*
 * The internal keyword makes a varriable or method only accessible to
 * a particular module and not the entire application
 * Example: A multi-module application
 */
internal fun millisForHoursForMdule(hours: Int) = hours * hoursInMinsPrivate