package dynamicProgramming

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FibonacciSequenceKtTest {

    @Test
    fun fib() {
        assertEquals(5,fib(5))
        assertEquals(3,fib(4))
        assertEquals(2,fib(3))
        assertEquals(1,fib(2))
    }
}