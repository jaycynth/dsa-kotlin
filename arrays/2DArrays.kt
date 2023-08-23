package arrays

fun createIdentityMatrix(size: Int): Array<Array<Int>> {
    val matrix = Array(size) { Array(size) { 0 } }

    for (i in 0 until size) {
        matrix[i][i] = 1
    }
    return matrix
}


fun main() {

    val matrix: Array<Array<Int>> = Array(3) { Array(3) { 0 } }

    val identityMatrix = createIdentityMatrix(2)

    for (i in matrix.indices) {
        for (j in 0 until matrix[i].size) {
            print(matrix[i][j])
        }
        println()
    }

    for (row in identityMatrix) {
        for (element in row) {
            print("$element ")
        }
        println() // Move to the next row
    }


}