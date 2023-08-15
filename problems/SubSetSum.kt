package problems

fun subsetSumExists(nums: IntArray, targetSum: Int): Boolean {
    val n = nums.size
    val dp = Array(n + 1) { BooleanArray(targetSum + 1) }

    // Initialize the base case
    for (i in 0..n) {
        dp[i][0] = true
    }

    // Fill the DP table
    for (i in 1..n) {
        for (j in 1..targetSum) {
            if (j >= nums[i - 1]) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]]
            } else {
                dp[i][j] = dp[i - 1][j]
            }
        }
    }

    return dp[n][targetSum]
}

fun main() {
    val nums = intArrayOf(3, 34, 4, 12, 5, 2)
    val targetSum = 9
    val result = subsetSumExists(nums, targetSum)
    if (result) {
        println("There is a subset that adds up to $targetSum")
    } else {
        println("No subset adds up to $targetSum")
    }
}
