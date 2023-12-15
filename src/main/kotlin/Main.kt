fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    doSomething();
    println("Program arguments: ${args.joinToString()}")
}

fun doSomething() {
    var firstName = "Odudu"
    val lastName = "Bassey"

    print("This is me ${lastName} ${firstName} learning KOTLIN!!");
}