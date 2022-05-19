import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/*
fun delayedFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(1000)
        emit(i)
    }
}
*/

fun delayedFlow(): Flow<Int> = flowOf(1, 2, 3).onEach { delay(1000) }

fun main() = runBlocking {
    println("❗️Going with the flow.")

    flowOf(1, 2, 3)
        .onEach { println("Emitting $it") }
        .collect { println("Collecting $it") }
}