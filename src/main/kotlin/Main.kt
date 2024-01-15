
fun main(): Unit {
    /*
     * The easiest way to create a set in kotlin is to use a builder function
     */
    println("Immutable Set")
    val languages = setOf("Java", "Kotlin", "C++", "Javascript")

    println("the size of the set is ${languages.size}")
    for(language in languages) {
        println("- $language")
    }
    println("Oddy has started learning python? ${languages.contains("Python")}")

    println("Mutable Set")
    val frameworks: MutableSet<String> = mutableSetOf("Springboot", "Quarkus", "JavaFx", "Android", "nodejs");
    frameworks.remove("nodejs");
    frameworks.forEach { println(it) }

    println("Immutable Maps")
    val scores = mapOf(Pair("Daniel", 32), Pair("Richard", 67), "Umeh" to 76, "Oddy" to 98);
    println("Richard scored ${scores["Richard"]}")
    println("printing the value of the map using the keyset")
    for(record in scores) {
        println("${record.key} scored ${record.value}")
    }

    println("printing the value of the map using map destructuring")
    for((key, value) in scores) {
        println("$key scored $value")
    }

    println("Report contains Richard score? ${scores.containsKey("Richard")}")
    println("Report contains Bangu score? ${scores.containsKey("Bangu")}")

    println("Mutable Maps")
    val weights: MutableMap<String, Double> = mutableMapOf("Daniel" to 43.3, "Emma" to 78.0, "Vicky" to 67.5)
    weights["Panny"] = 75.9
    weights.remove("Daniel")
    weights.replace("Emma", 87.9)
    weights.forEach { println(it) }
}