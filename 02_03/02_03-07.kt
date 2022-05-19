import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    launch {
        delay(1000)
        println("Doing work.")
    }
    println("Hello 👋🏻")

    println("I'm done.")
}