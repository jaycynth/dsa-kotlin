package dynamicProgramming

/*
Problem:
	Maximum Profit in a Grid

	A robot is located in the top-left corner of a m x n grid (marked 'S' in the diagram below).
	The robot can only move either down or right at any point in time.
	The robot is trying to reach the bottom-right corner of the grid (marked 'E' in the diagram below).
	Each cell contains a coin the robot can collect.

	What is the maximum profit the robot can accumulate?

	+---+---+---+---+
	| S | 2 | 2 | 1 |
	+---+---+---+---+
	| 3 | 1 | 1 | 1 |
	+---+---+---+---+
	| 4 | 4 | 2 | E |
	+---+---+---+---+
*/

// Time complexity:
// Space complexity:
// f(i,j) = max(f(i-1, j), f(i, j-1)) + grid(i,j)

fun uniquePathMaximumProfit(grid: Array<Array<Int>>): Int {
    val m = grid.size
    val n = grid[0].size

    val dp = Array(m) { Array(n) { 0 } }

    dp[0][0] = 1

    for (i in 0 until m) {
        for (j in 0 until n) {
            dp[i][j] = grid[i][j]
            if (i > 0 && j > 0) {
                dp[i][j] += max(dp[i - 1][j], dp[i][j - 1])
            } else if (i > 0) {
                dp[i][j] += dp[i - 1][j]
            } else if (j > 0) {
                dp[i][j] += dp[i][j - 1]
            }
        }
    }

    return dp[m - 1][n - 1]
}


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}