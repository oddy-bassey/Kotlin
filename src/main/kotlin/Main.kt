
fun main(): Unit {

    val person = Student(21, "Danny", "Mike", 'M')
    print(person.age)
    print(person.firstName)
    print(person.lastName+"\n")
    person.printName()
}