import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


fun main(): Unit = runBlocking {
    val channel: ReceiveChannel<Int> = produce<Int> {
        repeat(5) {
            send(it)
        }
    }
    receiveNumbers(channel)
}


fun CoroutineScope.receiveNumbers(channel: ReceiveChannel<Int>) = launch {
    channel.consumeEach { element ->
        println("📥 Received $element")
    }
}