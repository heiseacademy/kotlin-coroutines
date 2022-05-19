import kotlinx.coroutines.*

// Coroutine 0
fun main(): Unit = runBlocking {
    // Coroutine 1
    launch {
        supervisorScope {
            // Coroutine 2
            launch {
                delay(1000)
                throw Exception("Danger! Danger!")
            }
            // Coroutine 3
            launch {
                delay(2000)
                println("Coroutine 3")
            }

            delay(2000)
            println("Coroutine 1")
        }
    }
    // Coroutine 4
    launch {
        delay(2000)
        println("Courtine 4")
    }
}