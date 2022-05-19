import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CoroutinesTest() {
    @Test
    fun `test doingWork`() = runBlocking {
        val actual = doingWork()
        assertTrue(true)
    }

    suspend fun doingWork(): String {
        delay(10_000)
        return "Done"
    }
}