import kotlinx.coroutines.*

object MyException : CancellationException()

// Coroutine 0
fun main(): Unit = runBlocking {
    // Coroutine 1
    launch {
        // Coroutine 2
        launch {
            delay(1000)
            throw CancellationException("Danger! Danger!")
        }
        // Coroutine 3
        launch {
            delay(2000)
            println("Coroutine 3")
        }

        delay(1500)
        println("Coroutine 1")
    }
    // Coroutine 4
    launch {
        delay(2500)
        println("Coroutine 4")
    }
}