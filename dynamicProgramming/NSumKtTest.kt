package dynamicProgramming

import org.junit.jupiter.api.Assertions.*

internal class NSumKtTest {

    @org.junit.jupiter.api.Test
    fun testNSum() {
        assertEquals(0, nSum(0))
        assertEquals(1, nSum(1))
        assertEquals(3, nSum(2))
        assertEquals(10, nSum(4))

    }
}