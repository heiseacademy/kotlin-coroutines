import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    println("main runBlocking      : Working on ${Thread.currentThread().name}")

    launch {
        delay(10)
        println("launch without        : Working on ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        delay(20)
        println("Default               : Working on ${Thread.currentThread().name}")
    }
}