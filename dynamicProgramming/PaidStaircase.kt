package dynamicProgramming

/*
Problem:
	Paid Staircase

	You are climbing a paid staircase. It takes n steps to reach to the top and you have to
	pay p[i] to step on the i-th stair. Each time you can climb 1 or 2 steps.
	What's the cheapest amount you have to pay to get to the top of the staircase?
*/

// Time complexity: O(n)
// Space complexity: O(n)

fun paidStaircase(n: Int, prices: IntArray): Int {
    val dp = IntArray(n + 1)

    dp[0] = 0
    dp[1] = prices[1]

    for (i in 2..n) {
        dp[i] = min(dp[i - 1], dp[i - 2]) + prices[i]
    }

    return dp[n]

}

/* Same problem and print the path taken */

fun paidStaircaseII(n: Int, p: IntArray): IntArray {
    val dp = IntArray(n + 1)
    val from = IntArray(n + 1)
    dp[0] = 0
    dp[1] = p[1]
    for (i in 2..n) {
        dp[i] = min(dp[i - 1], dp[i - 2]) + p[i]
        if (dp[i - 1] < dp[i - 2]) {
            from[i] = i - 1
        } else {
            from[i] = i - 2
        }
    }
    val path = mutableListOf<Int>()
    var curr = n
    while (curr >= 0) {
        path.add(curr)
        if (curr == 0) {
            break
        }
        curr = from[curr]
    }
    return reverse(path.toIntArray())
}


fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun reverse(nums: IntArray): IntArray {
    var i = 0
    var j = nums.size - 1
    while (i < j) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i++
        j--
    }
    return nums
}

fun main() {
    val arr = paidStaircaseII(8, intArrayOf(0, 3, 2, 4, 6, 1, 1, 5, 3))

    for (i in arr) {
        println(i)
    }
}