import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking {
    val flow = (1..5).asFlow()
    val myEmptyFLow = emptyFlow<Int>()

    println(flow.reduce { accumulator, value -> accumulator + value })
    myEmptyFLow.reduce { accumulator, value -> accumulator + value }
}