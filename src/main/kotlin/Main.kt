
fun main(): Unit {
    print(NetworkConfig.baseUrl)
    print(NetworkConfig.getNetworkDetails())

    // object expression
    val provider: NetworkInfoProvider = object: NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            TODO("Not yet implemented")
        }
    }

    provider.getNetworkDetails()
}