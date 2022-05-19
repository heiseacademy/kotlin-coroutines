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
        .onCompletion {
            if (it != null) println("❗️ Exception")
        }
        .collect { println("Collecting $it") }
}