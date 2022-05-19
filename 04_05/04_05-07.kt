import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking {
    val flow = (1..5).asFlow()
    val singleValueFlow = listOf(1).asFlow()
    val emptyFLow = emptyFlow<Int>()

    println(flow.fold(42) { accumulator, value -> accumulator + value })

    println(emptyFLow.fold(42) { accumulator, value -> accumulator + value })
}