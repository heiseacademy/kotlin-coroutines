import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = (1..10).asFlow()

    flow
        .map { "flow $it" }
        .mapNotNull { "not null $it" }
        .collect { value -> println(value) }
}