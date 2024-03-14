
fun main(): Unit {
    var state: UIState = UIState.Loading
    render(state)

    state = UIState.Loaded("Mario", "Rumble jack")
    render(state)

    state = UIState.Error(IllegalStateException())
    render(state)
}

fun render(state: UIState) = when(state) {
    is UIState.Error -> println("Error")
    is UIState.Loaded -> println("Loaded: ${state.title}")
    UIState.Loading -> println("Loading...")
}