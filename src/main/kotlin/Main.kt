
fun main(vararg args: String): Unit {
    if (args.isEmpty()) {
        print("Pass at least one runtime argument")
        return
    }
    println("first argument is ${args[0]}")
    args.forEach { print("${it} ") }
}