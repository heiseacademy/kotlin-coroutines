import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    println("❗️Going with the flow.")

    flowOf(1, 2, 3)
        .onEach { println("Emitting $it") }
        .collect { println("Collecting $it") }
}