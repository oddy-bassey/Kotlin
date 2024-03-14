
class SearchController {
    private var query: String = ""

    init {
        MAX_RESULTS
    }
    /*
     * Companion objects have access to private properties and methods of
     * the enclosing class. Once we have our companion object, we can
     * reference it's properties and methods by referencing the enclosing
     * class name
     */
    companion object {
        private const val MAX_RESULTS = 20
        fun create(initialQuery: String) : SearchController {
            val controller = SearchController()
            controller.query = initialQuery
            return controller
        }
    }
}