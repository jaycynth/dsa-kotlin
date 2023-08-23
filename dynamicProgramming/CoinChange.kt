package dynamicProgramming

fun coinChange(coins: List<Int>, amount: Int): Int {
    val dp = IntArray(amount + 1) { Int.MAX_VALUE }
    dp[0] = 0

    for (coin in coins) {
        for (i in coin..amount) {
            dp[i] = minOf(dp[i], dp[i - coin] + 1)
        }
    }
    return if (dp[amount] != Int.MAX_VALUE) dp[amount] else -1
}


fun main() {
    println(coinChange(arrayListOf(1, 5, 6,8), 11))
}