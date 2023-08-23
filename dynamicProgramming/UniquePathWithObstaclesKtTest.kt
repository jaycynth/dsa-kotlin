package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UniquePathWithObstaclesKtTest {

    @Test
    fun uniquePathsWithObstacles() {
        assertEquals(
            3, uniquePathsWithObstacles(
                arrayOf(
                    arrayOf(0, 0, 0, 0),
                    arrayOf(0, 0, 1, 1),
                    arrayOf(0, 0, 0, 0)
                )
            )
        )
    }
}