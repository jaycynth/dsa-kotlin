package problems

import kotlin.math.ceil

fun solution(X: Int, Y: Int, D: Int): Int {
    val distance = (Y - X) % D
    return if (distance == 0)
        (Y - X) / D
    else ((Y - X) / D) + 1


//    return ceil(Y.toDouble() / (X + D)).toInt()
}

fun main() {

    println(solution(10, 85, 30))

}