import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    println("❗️Going with the flow.")

    flowOf<Int>()
        .onEmpty {
            println("Warning")
            emit(0)
        }
        .collect { println("Collecting $it") }
}