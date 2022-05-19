import kotlinx.coroutines.*

fun main(): Unit {
    runBlocking {
        launch {
            delay(1000)
            println("Doing work 1")
        }
        launch {
            delay(500)
            println("Doing work 2")
        }
    }

    println("I'm done.")
}