package arrays

/* Arrays in kotlin are immutable; once created cannot be resized
 You can add new element in array in Kotlin in several ways –
         Using MutableList
         Using System.arraycopy
         Using Array.copyOf
         Using ArrayList
*/

fun insertEnd(arr: IntArray, value: Int):IntArray {
    val mutableArr = arr.toMutableList()
    mutableArr.add(value)

    for (element in mutableArr) {
        print(" $element")
    }

    return mutableArr.toIntArray()
}

fun insertFront(arr: IntArray, value: Int):IntArray {
    val mutableArr = arr.toMutableList()
    //Specify index 0; to add at beginning or any other index; add does not overwrite but shifts the values to the right
    mutableArr.add(0,value)

    for (element in mutableArr) {
        print(" $element")
    }

    return mutableArr.toIntArray()
}


fun main() {

//    val arr = intArrayOf(1, 2, 3, 4, 5)
//    arr[5] = 10     // Trying to add an item at index = 5, Exception Occurred


    val arr2 = intArrayOf(1,2,3)
    insertEnd(arr2,4)

    val arr3 = intArrayOf(10,20,30)
    insertFront(arr3,40)



}