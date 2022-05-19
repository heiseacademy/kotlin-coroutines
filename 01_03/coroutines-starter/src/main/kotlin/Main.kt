
fun main(): Unit = runBlocking {
    repeat(100_000) {
        println("Start $it")
        launch {
            delay(1000L)
            print(".")
        }
    }
}}