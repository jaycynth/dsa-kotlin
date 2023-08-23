package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UniquePathsKtTest {

    @Test
    fun uniquePaths() {
        assertEquals(10, uniquePaths(3, 4))
        assertEquals(1, uniquePaths(1, 1))

    }
}