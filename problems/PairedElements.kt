package problems


fun solution(A: IntArray): Int {

    var unpairedValue = 0

    if (A.isEmpty()) {
        return 0
    }

    if (A.size % 2 == 0) {
        return 0
    }

    for (element in A) {
        unpairedValue = unpairedValue xor element
    }


    return unpairedValue
}

fun solution2(arr: IntArray): Int {
    return arr.toList().reduce { i1, i2 -> i1 xor i2 }
}

//solution with sort
fun solution3(arr: IntArray): Int {
    var unpairedValue = 0

    arr.sort()

    for (i in 0 until arr.size - 1) {
        if (arr[i] != arr[i + 1]) {
            unpairedValue = arr[i]
        }
    }

    return unpairedValue
}



fun orOperation() {
    val num1 = 12
    val num2 = 25

    val res = num1 or num2

    println(res)
}

fun main() {
//    println(solution(intArrayOf(9, 9, 6)))
    println(solution3(intArrayOf(9,3,9,3,9,9,7)))

//    orOperation()
}