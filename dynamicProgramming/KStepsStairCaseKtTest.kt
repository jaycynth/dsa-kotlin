package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KStepsStairCaseKtTest {

    @Test
    fun stairCaseKSteps() {
        assertEquals(13, stairCaseKSteps(5, 3))
        assertEquals(4, stairCaseKSteps(3, 3))
        assertEquals(8, stairCaseKSteps(5, 2))
        assertEquals(3, stairCaseKSteps(3, 2))
    }
}