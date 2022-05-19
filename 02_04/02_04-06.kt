import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(10000) { i ->
                println("▶️ Before delay $i")
                delay(500)
                println("👷: I'm doing some work here: $i")
            }
        } catch (e: CancellationException) {
            println(e)
            throw e
        }
    }

    delay(2000)

    job.cancelAndJoin()
    println("main: I'm done")
}