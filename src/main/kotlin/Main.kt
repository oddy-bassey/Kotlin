import java.io.File

fun main(): Unit {
    print("Enter the name of the user: ")
    val username = readln() ?: ""
    println("User entered: ${username}")

    print("Enter a file name: ")
    val filename = readln()
    val isFileValid = File(filename).isFile

    if(isFileValid) {
        println("It is a valid file")
    }else{
        println("It's not a valid file")
    }
}