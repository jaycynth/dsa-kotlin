package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PaidStaircaseKtTest {

    @Test
    fun paidStaircase() {
        assertEquals(6, paidStaircase(3, intArrayOf(0, 3, 2, 4)))
        assertEquals(8, paidStaircase(4, intArrayOf(0, 3, 2, 4,6)))

    }

    @Test
    fun paidStaircaseII() {
        assertArrayEquals(intArrayOf(0, 2, 3, 5, 6, 8), paidStaircaseII(8, intArrayOf(0, 3, 2, 4, 6, 1, 1, 5, 3)))

    }
}