import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = (1..10).asFlow().onEach { println("Emit $it") }

    flow
        .take(5)
        .collect { println("Collect $it") }
}