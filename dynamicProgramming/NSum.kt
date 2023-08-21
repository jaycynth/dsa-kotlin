package dynamicProgramming

/*

Problem:
	Find the sum of the first N numbers.

Objective function:
	f(i) is the sum of the first i elements.

Recurrence relation:
	f(n) = f(n-1) + n
 */

fun nSum(n: Int): Int {
    val dp = IntArray(n+1)
    dp[0] = 0

    for(i in 1 .. n ){
        dp[i] = dp[i-1] + i
    }

    return dp[n]
}

fun main(){
    println("Sum is ${nSum(4)}")
}