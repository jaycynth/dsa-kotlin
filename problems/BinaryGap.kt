package problems



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
