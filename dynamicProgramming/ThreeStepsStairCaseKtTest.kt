package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ThreeStepsStairCaseKtTest {

    @Test
    fun threeStepsStairCase() {
        assertEquals(13, threeStepsStairCase(5))
        assertEquals(4, threeStepsStairCase(3))
    }

    @Test
    fun threeStepsStairCaseFail() {
        assertNotEquals(3, threeStepsStairCase(3))
        assertNotEquals(8, threeStepsStairCase(5))
    }

}