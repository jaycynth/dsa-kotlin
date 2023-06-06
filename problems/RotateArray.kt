package problems

fun solution(A: IntArray, K: Int): IntArray {

    if(A.isEmpty()){
        return A
    }

    //last element saved in temp
    val temp = A[A.size - 1]

    var times = K

    if (times > 0) {
        for (curIndex in A.lastIndex downTo 1) {
            A[curIndex] = A[curIndex - 1]
        }

        //assign first element to be the last element saved in temp
        A[0] = temp
        times--
        return solution(A, times)

    }

    return A

}


fun main() {

    for(element in solution(intArrayOf(3,8,9,7,6),3)) {
        print("$element ")
    }

}
