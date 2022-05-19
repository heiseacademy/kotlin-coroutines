import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    println("main runBlocking      : Working on ${Thread.currentThread().name}")

    launch(Dispatchers.Unconfined) {
        println("Unconfined            : Working on ${Thread.currentThread().name}")
        delay(50)
        println("Unconfined            : Working on ${Thread.currentThread().name}")
    }
}