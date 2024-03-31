
/* Delegation
 * Interface delegates
 * Property delegates:
 *  - lazy delegate: this allows us to differ initialization of a property
 *    until the time it's first accessed
 *  - observable delegate: this lets us monitor and respond to changes in a
 *    property
 */

fun main(): Unit {
    val appLogger = ApplicationLogger(SimpleLogger(), ApplicationObservability())
    appLogger.log("Info", appLogger)
    appLogger.log("Info", "I love Java :)")

    println(appLogger.getMetric("100% battery, 10C hotness"))

    val viewModel = ViewModel()
    viewModel.search("toople")
    viewModel.search("Ansible")
}
