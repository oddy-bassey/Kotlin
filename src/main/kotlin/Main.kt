
fun main(): Unit {
    val task1 = Task("A1", "Build search feature")
    val task2 = Task("A2", "Add analytics")

    println(task1.name)
    println(task2.name)

    // checking the value of the data class variable if they match
    if (task1.name == task2.name) {
        println("task1 and task2 are the same")
    }else {
        println("task1 and task2 are different")
    }

    /* kotlin provides an implementation which help to check the values
     * of the data class properties without checking each variable
     */
    val task3 = Task("A3","Add analytics")
    val task4 = Task("A3","Add analytics")
    if (task3 == task4) {
        println("task3 and task4 are the same")
    }else {
        println("task3 and task4 are different")
    }

    /* Copy function
     * The compiler generates a copy function which the compiler use to copy the
     * instance of a data class along with all it's associated data
     */
    val task2Copy = task2.copy()
    if (task2Copy == task2) {
        println("task2 and task2Copy are the same")
    }else {
        println("task2 and task2Copy are different")
    }

    /* NOTE
     * The Copy function also enables us to modify specific values when calling that
     * Copy function using named argument
     */
    val task3Copy = task2.copy(id = "C3")
    if (task3Copy == task2) {
        println("task2 and task3Copy are the same")
    }else {
        println("task2 and task3Copy are different")
    }

    /* Destructure
     * This allows us to extract the public values of a data class into variables
     * without having to explicitly reference them
     */
    val (id, name) = task1
    println("Destructured values: id: $id, name: $name")
    /* NOTE
     * If a data class has 3 properties, and we used Destructuring with only 2
     * variables, the two data class properties will be extracted and the third one
     * will be unused
     *
     * Pros
     ** data classes helps encourage immutability
     ** helps reduce the amount of code required for making direct comparisons
     ** or for copying our value holders
     ** you may consider data classes for representing:
     *  - API responses
     *  - Database elements
     *  - UI states
     * really anything that you might want to compare that benefits being immutable
     */
}