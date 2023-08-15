package problems

import java.util.*
import java.util.stream.Collectors


fun solution8(A: IntArray): Int {

    val distinct: Set<Int> = A.toSet()

    var index = 1
    while (true) {
        if (!distinct.contains(index)) {
            return index
        }
        index++
    }
}


fun main() {
    println(solution(intArrayOf(1, 3, 6, 4, 1, 2)))

}