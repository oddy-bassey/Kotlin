import kotlin.properties.Delegates

class ViewModel {
    // observable property delegate
    var currentQuery: String by Delegates.observable("") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
    // lazy property delegate
    val logger: Logger by lazy {
        println("Initializing the logger")
        ApplicationLogger(SimpleLogger(), ApplicationObservability())
    }

    fun search(query: String) {
        logger.log("Query Info:", query)
        currentQuery = query
    }
}