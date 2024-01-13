
fun main(): Unit {
    println("List")

    val list1: List<String> = listOf("debby", "mango", "rice");
    val list2 = listOf(1, 2, 3, null)
    val list3 = List<Int>(5) {index ->
        index * 2
    }
    list3.forEach { println(it) }
    val emptyList: List<Int> = emptyList();
    val firstValue = list3.get(0)
    val secondValue = list3[1]

    val languages = mutableListOf<String>("Java", "Kotlin", "C#", "Php");
    languages.set(0, "JAVA")
    languages[languages.size-1] = "PHP"

    languages.add("Javascript")
    languages.add("C++")

    languages.removeAt(2)
    languages.remove("PHP")

    languages.forEach{ println(it) }

    // type compatibility
    val data: List<String> = mutableListOf("dog", "fish", "cat")
    // data[0] = "we": this will not work because the mutable list has now been assigned to an immutable list
}