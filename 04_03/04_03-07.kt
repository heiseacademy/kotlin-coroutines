import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun flow() = flow {
    emit(1)
    emit(2)
}


fun main() = runBlocking {
    println("🟢 Going with the flow.")

    flow()
        .onCompletion { println("I'm done") }
        .collect { println("Collecting $it") }
}