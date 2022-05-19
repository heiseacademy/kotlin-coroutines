import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import org.junit.jupiter.api.Test

class CoroutinesTest() {
    @Test
    fun `test with delays`() = runTest {
        launch {
            delay(1)
            println("🍏 1: $currentTime")
            delay(999)
            println("🍏 2: $currentTime")
            delay(500)
            println("🍏 3: $currentTime")
            delay(5000)
            println("🍏 4: $currentTime")
        }
        println("Start: $currentTime")
        advanceTimeBy(1)

        println("After advanceTimeBy(1): $currentTime")
        runCurrent()
        println("After runCurrent")
        advanceTimeBy(2000)

        println("After advanceTimeBy(2000)")

        advanceUntilIdle()

        println("After advanceUntilIdle(): $currentTime")
    }
}