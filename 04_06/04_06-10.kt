import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


fun main(): Unit = runBlocking {
    val channel: ReceiveChannel<Int> = produce(capacity = 3) {
        repeat(1000) {
            println("⬆️: Will send $it")
            delay(50)
            channel.send(it)
            delay(50)
            println("⬆️: $it sent")
        }
    }
    receiveNumbers(receiver = "🍓", channel)
    receiveNumbers(receiver = "🍌", channel)
    receiveNumbers(receiver = "🍆", channel)
}


fun CoroutineScope.receiveNumbers(receiver: String, channel: ReceiveChannel<Int>) = launch {
    delay(500)
    channel.consumeEach { element ->
        println("$receiver: Received $element")
        delay(500)
    }
}