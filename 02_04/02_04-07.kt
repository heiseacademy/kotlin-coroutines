import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(Dispatchers.Default) {
        // DON'T DO THIS!!!
        var i = 0
        while (true) {
            Thread.sleep(500)
            println("👷: I'm doing some work here: $i")
            i++
        }
    }

    delay(2000)
    job.cancelAndJoin()

    println("main: I'm done")
}