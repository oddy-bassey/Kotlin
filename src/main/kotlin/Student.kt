class Student(
    age: Int,
    firstName: String,
    lastname: String,
    gender: Char): Person(age, firstName, lastname, gender) {
    override fun printName() {
        println("My name is Mr $firstName $lastName")
    }
}