sealed class StringResult {
    class Success (val value: String): StringResult()
    class Error (val error: Throwable): StringResult()
}