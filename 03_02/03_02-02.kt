import kotlinx.coroutines.*

// Coroutine 0
fun main(): Unit = runBlocking {
    val scope = CoroutineScope(SupervisorJob())
    // Coroutine 1
    launch {
        // Coroutine 2
        scope.launch {
            delay(1000)
            throw Exception("Danger! Danger!")
        }
        // Coroutine 3
        scope.launch {
            delay(2000)
            println("Coroutine 3")
        }

        delay(2000)
        println("Coroutine 1")
    }
    // Coroutine 4
    launch {
        delay(2000)
        println("Courtine 4")
    }
}