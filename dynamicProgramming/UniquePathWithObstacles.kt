package dynamicProgramming

/*
Problem:
	Unique Paths with Obstales

	A robot is located in the top-left corner of a m x n grid (marked 'S' in the diagram below).
	The robot can only move either down or right at any point in time.
	The robot is trying to reach the bottom-right corner of the grid (marked 'E' in the diagram below).

	Now consider if some obstacles are added to the grids.
	How many unique paths would there be?

	+---+---+---+---+
	| S |   |   |   |
	+---+---+---+---+
	|   | 1 | 1 | 1 |
	+---+---+---+---+
	|   |   |   | E |
	+---+---+---+---+

	An obstacle and empty space is marked as 1 and 0 respectively in the grid.
*/

// Time complexity:
// Space complexity:
fun uniquePathsWithObstacles(grid: Array<Array<Int>>): Int {
    val m = grid.size
    val n = grid[0].size
    println(m)
    println(n)

    val dp: Array<Array<Int>> = Array(m) { Array(n) { 0 } }

    dp[0][0] = 1

    for (i in 0 until m) {
        for (j in 0 until n) {
            if (grid[i][j] == 1) {
                dp[i][j] = 0
                continue
            }
            if (i > 0 && j > 0) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            } else if (i > 0) {
                dp[i][j] = dp[i - 1][j]
            } else if (j > 0) {
                dp[i][j] = dp[i][j - 1]
            }
        }
    }

    return dp[m - 1][n - 1]

}