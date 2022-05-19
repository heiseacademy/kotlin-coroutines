import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun flow() = flow {
    emit(1)
    emit(2)
    throw RuntimeException()
}

fun main() = runBlocking {
    println("🟢 Going with the flow.")

    flow()
        .onEach { println("Logging $it") }
        .catch {
            println("❗️Catching")
            emit(0)
        }
        .collect { println("Collecting $it") }
}