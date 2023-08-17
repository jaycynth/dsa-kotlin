package dynamicProgramming

/*
Problem:
	Climbing Stairs

	You are climbing a staircase. It takes n steps to reach to the top.
	Each time you can either climb 1 to k steps.
	In how many distinct ways can you climb to the top?

Framework for Solving DP Problems:
	1. Define the objective function
		f(i) is the number of distinct ways to reach the i-th stair by k number os steps.
	2. Identify base cases
		f(0) = 1
		f(1) = 1
	3. Write down a recurrence relation for the optimized objective function
		f(n) = f(n-1) + f(n-2) + .... + f(n-k)
	4. What's the order of execution?
		bottom-up
	5. Where to look for the answer?
		f(n)
*/

// Time complexity: O(nk)
// Space complexity: O(n)

fun stairCaseKSteps(n: Int, k: Int): Int {
    val dp = IntArray(n + 1)

    dp[0] = 1
    dp[1] = 1

    for (i in 2..n) {
        //for all the Ks starting from 1
        for (j in 1..k) {
            if (i - j < 0) {
                continue
            }
            dp[i] += dp[i - j]
        }
    }

    return dp[n]
}


// Time complexity: O(nk)
// Space complexity: O(k)

fun stairCaseKStepsOptimized(n: Int, k: Int): Int {
    val dp = IntArray(k)

    dp[0] = 1

    for (i in 1..n) {
        //for all the Ks starting from 1
        for (j in 1 until k) {
            if (i - j < 0) {
                continue
            }
            dp[i % k] += dp[(i - j) % k]
        }
    }

    return dp[n % k]
}

fun main() {
    val n = 4
    val k = 2
    println("Number of distinct ways one can climb to stair $n is ${stairCaseKSteps(n, k)}")
    println("Number of distinct ways one can climb to stair Optimized $n is ${stairCaseKStepsOptimized(n, k)}")

}

