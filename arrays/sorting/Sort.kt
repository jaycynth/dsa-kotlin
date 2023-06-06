package arrays.sorting


fun sort(arr: Array<Int>){
    arr.sort()
    println(arr.contentToString())
}

fun sortIndex(arr: Array<Int>){
    arr.sort(1, 3)
    println(arr.contentToString())
}

fun sortWith(arr: Array<Int>){
    arr.sortWith(Comparator.reverseOrder())
    println(arr.contentToString())

    //custom comparator -> brings reverse order
    arr.sortWith(Comparator{ o1, o2 -> o2.compareTo(o1) })
    println(arr.contentToString())
}


fun sortBy(arr: Array<Int>){

    //sorts by natural order => 1,2,3,4,5
    arr.sortBy { it }
    println(arr.contentToString())

    arr.sortByDescending { it }
    println(arr.contentToString())
}

fun sortDescending(arr: Array<Int>){

    arr.sortDescending()
    println(arr.contentToString())
}

fun main() {
    val arr = arrayOf(4, 2, 1, 5, 3)
//    sort(arr)
//
//    val arr2 = arrayOf(40, 20, 10, 50, 30)
//    sortIndex(arr2)

    sortWith(arr)

}