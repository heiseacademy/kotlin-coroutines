import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


fun main(): Unit = runBlocking {
    val channel: ReceiveChannel<Int> = produce(capacity = 3) {
        repeat(5) {
            println("⬆️: Will send $it")
            delay(50)
            channel.send(it)
            delay(50)
            println("⬆️: $it sent")
            println("---")
        }
    }
    receiveNumbers(channel)
}


fun CoroutineScope.receiveNumbers(channel: ReceiveChannel<Int>) = launch {
    delay(1000)
    channel.consumeEach { element ->
        println("📥 Received $element")
        delay(1000)
    }
}