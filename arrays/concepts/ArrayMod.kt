package arrays.concepts

/*The modulus operator (%), when used with an appropriate value, can be employed to create cyclic behavior or "wrap around" behavior
for array indices. This can be useful when you want to implement circular buffers, rotating arrays, or other periodic patterns.


In this example, the `rotateArray` function takes an array and a shift amount as parameters. It creates a new array, and for each element
in the original array, it calculates the new position using the modulus operator to ensure the rotation effect.
The `% size` operation ensures that the index wraps around within the array's bounds.

Keep in mind that this example rotates the array to the right (positive shift).
If you want to rotate it to the left, you can adjust the modulus calculation accordingly.

Remember that this example is a basic illustration of how the modulus operator can be used to create cyclic behavior in an array.
Depending on your use case, you might need to adapt and customize the approach.

 */

fun rotateArray(arr: IntArray, shiftAmount: Int): IntArray {
    val size = arr.size
    val rotatedArray = IntArray(size)

    for (i in arr.indices) {
        val newPosition = (i + shiftAmount) % size
        rotatedArray[newPosition] = arr[i]
    }

    return rotatedArray
}

fun main() {
    val originalArray = intArrayOf(1, 2, 3)
    val shiftAmount = 2

    val rotatedArray = rotateArray(originalArray, shiftAmount)

    println("Original Array: ${originalArray.joinToString(", ")}")
    println("Rotated Array: ${rotatedArray.joinToString(", ")}")
}


