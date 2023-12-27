
fun main(): Unit {
    var counter = 0

    println("While Loop")
    while (counter <= 5) {
        println(counter)

        counter++;
    }

    println("Do-While Loop")
    do {
        println(counter)
        counter-=1
    } while (counter > 0)
}
