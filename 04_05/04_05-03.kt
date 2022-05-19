import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking {
    val flow = (1..5).asFlow()

    val mutableSet = mutableSetOf(1, 2, 3)
    println(flow.toSet())
    println(flow.toSet(mutableSet))
}