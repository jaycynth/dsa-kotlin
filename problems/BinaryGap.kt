package problems

/** A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

**/

fun toBinary(x: Int, len: Int): String {
//    return String.format(
//        "%" + len + "s",
//        Integer.toBinaryString(x)
//    ).replace(" ".toRegex(), "0")

    return Integer.toBinaryString(x)
}


fun solution(N: Int): Int {
    // where we store our gaps
    val gaps = mutableListOf<Int>()

    val filteredList = Integer.toBinaryString(N).split("").filter { x -> x != "" }


    return binaryGap(filteredList, gaps)
}

fun binaryGap(binaryArray: List<String>, gaps: MutableList<Int>): Int {

    //if value is equal to 0 or greater than 0 then a one exists,
    // if value is a negative then there are no ones
    //// ["1", "0", "0", "1"] - assuming N is 9
    val firstOne = binaryArray.indexOf("1")

    gaps.add(firstOne)


    if (firstOne > -1) {
        // new array created taking a slice of original array
        // from the index of the firstOne + 1 index
        // ["0", "0", "1"]
        val newArray = binaryArray.slice(firstOne + 1 until binaryArray.size)

        // finding second one via its index in new array slice
        val secondOne = newArray.indexOf("1");

        if (secondOne > 0) {
            // adding 2 to our gaps array
            gaps.add(secondOne)
        }

        return binaryGap(newArray.slice(secondOne + 1 until newArray.size), gaps)

    }

    // getting largest value in array
    return if (gaps.size > 0) gaps.maxOrNull()!! else 0

}

fun main() {
    var num = 1162
    var len = 16

    println(toBinary(num, len))    // 0010011100010000


    println(solution(1162))
}
