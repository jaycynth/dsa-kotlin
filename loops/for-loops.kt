package loops



// Iterating over a range
fun downToLoop() {
    for (i in 5 downTo 3) println(i)
}

fun loopBackward() {
    for (i in 5..1) print(i)             // prints nothing
}

fun loopForward() {
    for (i in 1..5) println(i)
}

fun loopStep() {
    for (i in 1..5 step 2) println(i)
    println("DOWN TO STEP")
    for (i in 5 downTo 1 step 2) println(i)
}

fun untilLoop(arr: IntArray){
    println("SIZE OF ARRAY IS ${arr.size}")

    for (i in 0 until arr.size - 1) {
        println(i)
    }

    // You cant do indices -1 to subtract, it removes the index 1
    for(j in arr.indices - 1){
        println(j)
    }
}

fun main() {

//    println("DOWN TO LOOP")
//    downToLoop()
//    println("LOOP BACKWARD")
//    loopBackward()
//    println("LOOP FORWARD")
//    loopForward()
//    println("LOOP STEP")
//    loopStep()

    untilLoop(intArrayOf(3,2,4))

}