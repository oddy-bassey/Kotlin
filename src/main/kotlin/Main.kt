import java.util.concurrent.Executors

class CustomThread: Thread("Custom Thread") {
    override fun run() {
        super.run()
        println(Thread.currentThread().name)
        println("executing process in thread!")
    }
}

class DeviceThread: Runnable {
    override fun run() {
        println(Thread.currentThread().name)
        println("executing device process in thread!")
    }
}

val singleThreadExecutor = Executors.newSingleThreadExecutor()
val multiThreadExecutor = Executors.newFixedThreadPool(3)

fun main(): Unit {
    println(Thread.currentThread().name)
//    CustomThread().start()
//    Thread(DeviceThread()).start()
//    singleThreadExecutor.submit(DeviceThread())

    for (i in 0..10) {
        multiThreadExecutor.submit(DeviceThread())
    }
}
