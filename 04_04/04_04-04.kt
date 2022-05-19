import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val flow = (1..10).asFlow()

    flow
        .transform { value ->
            if (value % 2 != 0 && value > 4) {
                emit(value)
                emit(value)
                emit(value)
            }
        }
        .collect { value -> println(value) }
}