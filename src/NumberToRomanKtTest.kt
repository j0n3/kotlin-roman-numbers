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

    @Test
    fun `test 7092 is ṼMMXCII`() {
        val actual = 7092.toRoman()
        assertEquals(actual, "ṼMMXCII")
    }

    @Test
    fun `test 9870 is MẊDCCCLXX`() {
        val actual = 9870.toRoman()
        assertEquals(actual, "MẊDCCCLXX")
    }

    @Test
    fun `test 39497 is MẊDCCCLXX`() {
        val actual = 39497.toRoman()
        assertEquals(actual, "ẊẊẊMẊCDXCVII")
    }

    @Test
    fun `test 54321 is ĹMṼCCCXXI`() {
        val actual = 54321.toRoman()
        assertEquals(actual, "ĹMṼCCCXXI")
    }

    @Test
    fun `test 394678 is ṀṀṀẊṀMṼDCLXXVIII`() {
        val actual = 394678.toRoman()
        assertEquals(actual, "ṀṀṀẊṀMṼDCLXXVIII")
    }

}