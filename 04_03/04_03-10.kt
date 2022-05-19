import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun flow() = flow {
    emit(1)
    emit(2)
}

fun main() = runBlocking {
    println("🟢 Going with the flow.")

    flow()
        .onEach {
            println("Logging $it")
            println("Collecting $it")
            throw RuntimeException("Boom!")
        }
        .catch {
            println("❗️Catching")
            emit(0)
            throw it
        }
        .collect()
}