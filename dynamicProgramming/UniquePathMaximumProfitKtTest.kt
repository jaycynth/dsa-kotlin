package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UniquePathMaximumProfitKtTest {

    @Test
    fun uniquePathMaximumProfit() {

        assertEquals(
            13, uniquePathMaximumProfit(
                arrayOf(
                    arrayOf(0, 2, 2, 1),
                    arrayOf(3, 1, 1, 1),
                    arrayOf(4, 4, 2, 0)
                )
            )
        )

        assertEquals(
            154, uniquePathMaximumProfit(
                arrayOf(
                    arrayOf(0, 2, 2, 50),
                    arrayOf(3, 1, 1, 100),
                    arrayOf(4, 4, 2, 0)
                )
            )
        )
    }
}