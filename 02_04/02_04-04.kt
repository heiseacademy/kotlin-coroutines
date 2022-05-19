import kotlinx.coroutines.*

fun main() = runBlocking {
    withTimeout(2000){
        launch {
            repeat(10000) { i ->
                delay(500)
                println("👷: I'm doing some work here: $i")
            }
        }
    }

    println("main: I'm done")
}