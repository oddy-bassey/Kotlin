import java.io.File
import kotlin.io.path.writeLines

fun main(): Unit {
    val scoresFile = File("src/scores.txt")
    scoresFile.forEachLine { line -> println(line) }

    val sortedLines = scoresFile.readLines().sorted()
    val outputFile = File("sorted-scores.txt").toPath()
    outputFile.writeLines(sortedLines)
}