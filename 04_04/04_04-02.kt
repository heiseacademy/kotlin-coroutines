import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = (1..10).asFlow()

    flow
        .filterNotNull()
        .filter { it % 2 == 0 }
        .filterNot { it % 2 == 0 }
        .filter { it <= 6 }
        .collect { value -> println(value) }
}