import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import org.junit.jupiter.api.Test

class CoroutinesTest() {
    @Test
    fun `test with delays`() = runTest {
        launch {
            delay(1000)
            println("🍏 1: $currentTime")
            delay(1000)
            println("🍏 3: $currentTime")
            delay(1000)
            println("🍏 5: $currentTime")
        }
        launch {
            delay(1500)
            println("🍌 2: $currentTime")
            delay(1000)
            println("🍌 4: $currentTime")
            delay(1000)
            println("🍌 6: $currentTime")
        }
    }
}