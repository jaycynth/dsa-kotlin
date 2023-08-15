package problems

fun permMissing(A: IntArray): Int {
    //Sum of consecutive integers from 1
    val n = A.size + 1
    val result = n * (n + 1) / 2

    val sum = A.sum()

    return result - sum
}


fun main() {
    println(permMissing(intArrayOf(1, 3, 6, 4, 1, 2)))

}
