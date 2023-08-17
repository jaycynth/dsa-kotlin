package utils

fun printMemory() {

    val runtime = Runtime.getRuntime()

    println("Memory allocated is ${runtime.totalMemory()}")

}