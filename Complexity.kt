fun sumFromOne(n: Int): Int {
    return (1..n).reduce { sum, element -> sum + element }
}//0(n)


//Sum of sequences using Fredrick Gauss
fun sumFromOne2(n: Int): Int {
    return n * (n + 1) / 2
}//0(1)

//You're given an unsorted array of numbers in a sequence from 1 to n with one of the numbers missing.
//Create a function that takes the unsorted array as an argument and returns the number that is missing from the array.

//const a = [2, 1, 5, 4]
//missingNum(a) // 3;

fun missingNum(arr: Array<Int>): Int {
    val sortedArr = arr.sortedArray()

    val total = sumFromOne2( sortedArr.size + 1)

    var sum = 0

    for(i in sortedArr){
        sum += i
    }

    return total - sum
}

fun main() {

    val arr = arrayOf(2, 1, 5, 4)
    println(missingNum(arr))
}