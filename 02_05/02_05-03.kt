package main.kotlin

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    println("start main")

    val time = measureTimeMillis {
        val one: Deferred<String> = async { grabFirstString() }
        val two = async { grabSecondString() }

        println("Hello ${one.await()} ${two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun grabFirstString(): String {
    println("grabFirstString: Start")
    delay(1000)
    return "world"
}

suspend fun grabSecondString(): String {
    println("grabSecondString: Start")
    delay(2000)
    return "again"
}