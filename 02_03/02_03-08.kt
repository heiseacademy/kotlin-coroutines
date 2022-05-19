import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    val job = launch {
        delay(1000)
        println("Doing work 1")
    }
    println("Hello 👋🏻")

    println("I'm done.")
}