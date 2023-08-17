package dynamicProgramming

/*
Problem:
	Climbing Stairs (k steps, space optimized, skip red steps)

	You are climbing a stair case. It takes n steps to reach to the top.
	Each time you can climb 1..k steps. You are not allowed to step on red stairs.
	In how many distinct ways can you climb to the top?
*/

// Time complexity: O(nk)
// Space complexity: O(k)

fun kStepsRedStairCase(n: Int, k: Int, stairs: BooleanArray): Int {
    val dp = IntArray(k)
    dp[0] = 1
    for (i in 1..n) {
        for (j in 1 until k) {
            if (i - j < 0) {
                continue
            }
            if (stairs[i - 1]) {
                dp[i % k] = 0
            } else {
                dp[i % k] += dp[(i - j) % k]
            }
        }
    }

    return dp[n % k]
}

fun main() {
    val n = 7
    val k = 3
    val stairs = booleanArrayOf(false, true, false, true, true, false, false)
    println("Number of distinct ways one can climb to stair $n is ${kStepsRedStairCase(n, k, stairs)}")

}