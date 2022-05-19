import kotlinx.coroutines.*

fun main(): Unit {
    runBlocking {
        coroutineScope {
            // First coroutine Scope
            launch {
                delay(1000)
                println("Doing work 1")
            }
            launch {
                delay(500)
                println("Doing work 2")
            }
        }

        coroutineScope
            // Second coroutine Scope
            launch {
                delay(1000)
                println("Doing work 3")
            }
            launch {
                delay(500)
                println("Doing work 4")
            }
        }
    }

    println("I'm done.")
}