package dynamicProgramming


/*  You are climbing a staircase. It takes n steps to reach to the top.
	Each time you can either climb 1 or 2 or 3 steps.
	In how many distinct ways can you climb to the top?

 */

fun threeStepsStairCase(n: Int): Int {
    val dp = IntArray(n + 1)

    dp[0] = 1
    dp[1] = 1
    dp[2] = 2

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    return dp[n]
}


fun main() {
    val n = 5
    println("Number of distinct ways one can climb to stair $n is ${threeStepsStairCase(n)}")


}