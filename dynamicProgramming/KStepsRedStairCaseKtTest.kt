package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KStepsRedStairCaseKtTest {

    @Test
    fun kStepsRedStairCase() {
        assertEquals(2, kStepsRedStairCase(7, 3, booleanArrayOf(false, true, false, true, true, false, false)))
    }
}