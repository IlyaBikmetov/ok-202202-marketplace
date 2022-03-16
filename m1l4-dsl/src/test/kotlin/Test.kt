import org.junit.Test

class Test {
    @Test
    fun `my test`() {
        cout{5 + 6}
    }

    @Test
    fun `cout with prefix`() {
        coutWithTimestamp {
            "my line: ${time()}"
        }
    }
}