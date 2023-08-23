package dynamicProgramming

/*
Problem:
	Unique Paths

	A robot is located in the top-left corner of a m x n grid (marked 'S' in the diagram below).
	The robot can only move either down or right at any point in time.
	The robot is trying to reach the bottom-right corner of the grid (marked 'E' in the diagram below).

	How many possible unique paths are there?

	+---+---+---+---+
	| S |   |   |   |
	+---+---+---+---+
	|   |   |   |   |
	+---+---+---+---+
	|   |   |   | E |
	+---+---+---+---+

	Above is a 3 x 4 grid. How many possible unique paths are there?
*/

// Time complexity:
// Space complexity:
// F(i,j) = F(i-1,j) + F(i,j-1)

fun uniquePaths(m: Int, n: Int): Int {
    val dp: Array<Array<Int>> = Array(m ) { Array(n ) { 0 } }

    dp[0][0] = 1

    for (i in 0 until m) {
        for (j in 0 until n) {
            when {
                i > 0 && j > 0 -> {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
                }
                i > 0 -> {
                    dp[i][j] = dp[i - 1][j]
                }
                j > 0 -> {
                    dp[i][j] = dp[i][j - 1]
                }
            }
        }
    }

    return dp[m - 1][n - 1]
}