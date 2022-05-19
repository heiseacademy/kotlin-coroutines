import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


fun main(): Unit = runBlocking {
    val channel = Channel<Int>()

    sendNumbers(channel)

    receiveNumbers(channel)
}

fun CoroutineScope.sendNumbers(channel: Channel<Int>) = launch {
    repeat(5) {
        println("⬆️: Will send $it")
        delay(100)
        channel.send(it)
        delay(100)
        println("⬆️: $it sent")
        println("---")
    }
}

fun CoroutineScope.receiveNumbers(channel: Channel<Int>) = launch {
    repeat(4) {
        val element = channel.receive()
        println("📥 Received $element")
    }
}