import java.io.File
import kotlin.io.path.writeLines

fun main(): Unit {
    doAssignment()
}
fun doAssignment(): Unit {
    print("Enter the name of the file: ")
    val filename = readln()

    if(filename.isNullOrEmpty()) {
        print("Invalid input!")
        return
    }

    val scoresFile = File("src/$filename.txt")
    if(!scoresFile.isFile) return

    val fileData = scoresFile.readLines()
    val scoreMap = fileData.map{
            val grade = it.split(":")
            grade[0] to grade[1]
        }
    val highestScoreMap = scoreMap.sortedByDescending { it.second }.take(3)
    val highestScores = highestScoreMap.map { "${it.first}:${it.second}" }

    val outputFile = File("highest-scores.txt").toPath()
    outputFile.writeLines(highestScores)
}