package collection

fun main(args:Array<String>){
    val list = listOf(-8, 3, 0,-10,4)

    println("DROP OPERATOR")
    dropOperator(list)

    println("DROP WHILE OPERATOR")
    dropWhileOperator(list)

    println("DROP LAST WHILE OPERATOR")
    dropLastWhileOperator(list)

}

//Returns a list containing all elements except first n elements.
fun dropOperator(list: List<Int>){
    println(list.drop(2))
}

//Returns a list containing all elements except first elements that satisfy the given predicate.
fun dropWhileOperator(list: List<Int>){
    println(list.dropWhile { it < 3 })
}

//Returns a list containing all elements except last elements that satisfy the given predicate.
fun dropLastWhileOperator(list: List<Int>){
    println(list.dropLastWhile { it < 3 })
}