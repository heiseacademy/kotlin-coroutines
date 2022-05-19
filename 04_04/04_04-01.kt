import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = (1..10).asFlow()

    flow
        .filter { it <= 6 }
        .collect { value -> println(value) }
}