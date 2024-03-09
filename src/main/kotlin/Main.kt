
fun main(): Unit {
    val direction: Direction = Direction.WEST

    println(direction.name)
    println(direction.ordinal)

    val parsedDirection = Direction.valueOf("SOUTH")
    println(parsedDirection.name)

    val apiValue = Direction.values()[0]
    println(apiValue.name)

    val highlightColor = HighlightColor.BLUE
    println(highlightColor.hexValue)
}