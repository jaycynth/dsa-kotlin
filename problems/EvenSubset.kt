package problems


fun sumSubsets(nums: List<Int>): Int {
    var sum = 0

    val outer: MutableList<List<Int>> = ArrayList()
    outer.add(ArrayList())
    for (arr in nums) {
        val size = outer.size
        for (i in 0 until size) {
            val internal: MutableList<Int> = ArrayList(outer[i])

            internal.add(arr)

            if (internal.size % 2 == 0) {
                sum += internal.reduce { a, b -> a + b }
                println(sum)
            }

            outer.add(internal)

        }
    }
    return sum
}

fun subsets(nums: List<Int>): List<List<Int>>? {
    val outer: MutableList<List<Int>> = ArrayList()
    outer.add(ArrayList())
    for (arr in nums) {
        val size = outer.size
        for (i in 0 until size) {
            val internal: MutableList<Int> = ArrayList(outer[i])

            internal.add(arr)

            if (internal.size % 2 == 0) {
                println(internal)
            }

            outer.add(internal)

        }
    }
    return outer
}

fun main(args: Array<String>) {
    val arr = listOf(1, 4, 2, 5)
    println(sumSubsets(arr))
    subsets(arr)
}

