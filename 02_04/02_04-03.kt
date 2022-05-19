import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(10000) { i ->
            delay(500)
            println("👷: I'm doing some work here: $i")
        }
    }

    delay(2000)

    job.cancelAndJoin()
    println("main: I'm done")
}