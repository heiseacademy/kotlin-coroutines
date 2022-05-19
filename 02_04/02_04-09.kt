import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(Dispatchers.Default) {
        var i = 0
        while (true) {
            Thread.sleep(500)

            ensureActive()

            println("👷: I'm doing some work here: $i")
            i++
        }
    }

    delay(2000)
    job.cancelAndJoin()

    println("main: I'm done")
}