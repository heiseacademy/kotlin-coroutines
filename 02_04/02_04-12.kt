import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(10000) { i ->
                delay(500)
                println("👷: I'm doing some work here: $i")
            }
        } finally {
            println("Just one more call!")
            launch {
                println("Maybe another one?")
            }
            delay(5000)
            println("Maybe another two?")
        }
    }

    delay(2000)

    println("main: Stop! Cancel time!")
    job.cancelAndJoin()
    println("main: I'm done")
}