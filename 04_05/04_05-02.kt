import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking {
    val flow = (1..5).asFlow()

    val list: List<Int> = flow.toList()
    println(list)

    val mutableList = mutableListOf(1, 2, 3)
    println(flow.toList(mutableList))
}