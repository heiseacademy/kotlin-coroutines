import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
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
    launch(newSingleThreadContext("AThreadOfMyOwn")) {
        delay(30)
        println("newSingleThreadContext: Working on ${Thread.currentThread().name}")
    }
}