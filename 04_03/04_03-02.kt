import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun delayedFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(1000)
        emit(i)
    }
}

fun main() = runBlocking {
    println("❗️Going with the flow.")

    delayedFlow()
        .onStart { println("Starting the flow")
        .collect { println("Collecting $it") }
}