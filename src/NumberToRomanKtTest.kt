import org.junit.Assert.*
import org.junit.Test

class NumberToRomanKtTest {

    @Test
    fun `test 1 is I`() {
        val actual = 1.toRoman()
        assertEquals(actual, "I")
    }

    @Test
    fun `test 3 is III`() {
        val actual = 3.toRoman()
        assertEquals(actual, "III")
    }

    @Test
    fun `test 1989 is MCMLXXXIX`() {
        val actual = 1989.toRoman()
        assertEquals(actual, "MCMLXXXIX")
    }

    @Test
    fun `test 3470 is MCMLXXXIX`() {
        val actual = 3470.toRoman()
        assertEquals(actual, "MMMCDLXX")
    }
}