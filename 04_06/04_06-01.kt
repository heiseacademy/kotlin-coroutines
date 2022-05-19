import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


fun main(): Unit = runBlocking {
    val channel = Channel<Int>()

    sendNumbers(channel)

    receiveNumbers(channel)
}

fun CoroutineScope.sendNumbers(channel: Channel<Int>) = launch {
    println("⬆️: Sending 1")
    channel.send(1)
    println("⬆️: 1 sent")
}

fun CoroutineScope.receiveNumbers(channel: Channel<Int>) = launch {
    delay(5000)
    val element = channel.receive()
    println("📥 Received $element")
}
