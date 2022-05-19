import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CoroutinesTest() {
    @Test
    fun `test doingWork`() = runTest {
        val actual = doingWork()
        assertTrue(true)
    }

    suspend fun doingWork(): String {
        delay(10_000)
        return "Done"
    }
}