/*
 while we can provide default implementations for interface methods,
 we cannot provide default values for interface properties.
 */
interface StringProvider {
    val placeHolder: String
    fun getString(id: Int): String = id.toString()
}

interface ResourceProvider: StringProvider {
    fun getDimension(id: Int): Long = id.toLong()
}

class DefaultResourceProvider: ResourceProvider {
    override val placeHolder: String = "<placeholder>"
    /* the default methods can be overridden or not by the implementing class

    override fun getString(id: Int): String {
        return "id: $id"
    }

    override fun getDimension(id: Int): Long {
        return id.toLong()
    }
    */
}

fun main(): Unit {
    val someVariable: Any? = null

    if(someVariable is StringProvider) {
        println("The variable is StringProvider")
    }

    val streamProvider: DefaultResourceProvider = DefaultResourceProvider()
    println("Id: ${streamProvider.getString(340)}")
    println("Dimension: ${streamProvider.getDimension(322)}")
    println(streamProvider.placeHolder)
}