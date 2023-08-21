package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StairCaseKtTest {

    @Test
    fun stairCase() {
        assertEquals(8, stairCase(5))
        assertEquals(3, stairCase(3))
        assertEquals(13, stairCase(6))
    }

    @Test
    fun stairCaseFail() {
        assertNotEquals(4, stairCase(3))
        assertNotEquals(13, stairCase(5))
    }

}