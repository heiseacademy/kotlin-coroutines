import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val firstFlow = (1..4).asFlow().onEach { delay(300) }
    val secondFlow = flowOf("a", "b", "c").onEach { delay(1000) }

    firstFlow
        .zip(secondFlow) { a, b -> "$a:$b" }
        .collect { println("Collect $it") }
}