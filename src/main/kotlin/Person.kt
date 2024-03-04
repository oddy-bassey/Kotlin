open class Person(age: Int,
    protected val firstName: String,
    protected val lastName: String,
    private val gender: Char) {

    /* an init block is a section of code that runs when an instance of a class is created
     * init block and properties are processed in the order in which they are defined
     * in the class body
     */
    init {
        check(age >= 0) {
            "A persson's age cannot be negative"
        }
    }
    val age: Int = age

    open fun printName() = println("My name is $lastName $firstName.")
}
