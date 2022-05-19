import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import org.junit.jupiter.api.Test
import org.testng.annotations.BeforeTest

class CoroutinesTest() {
    private val myScope = TestScope()

    @BeforeTest
    fun setUp() {
        myScope.advanceTimeBy(1000)
    }

    @Test
    fun `test doingWork`() = myScope.runTest {
        println("Start: $currentTime")
        delay(1000)
        println("Done: $currentTime")
    }
}