sealed class UIState {
    // loading
    object Loading: UIState()

    // loaded
    data class Loaded(
        val title: String,
        val subtitle: String
    ): UIState()

    // error
    class Error(val error: Throwable): UIState()
}