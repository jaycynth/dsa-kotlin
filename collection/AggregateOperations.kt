package collection

fun main(args: Array<String>) {
    val list = listOf(-8, -2, 0,-10)
//    println("ANY OPERATOR")
//    anyOperator(list)
//    println("ALL OPERATOR")
//    allOperator(list)
//    println("COUNT OPERATOR")
//    countOperator(list)
//    println("FOLD OPERATOR")
//    foldOperator(list)
//    println("FOLD RIGHT OPERATOR")
//    foldRightOperator(list)
//    println("FOREACH OPERATOR")
//    forEachOperator(list)
//    println("FOREACH INDEXED OPERATOR")
//    forEachIndexedOperator(list)
//    println("MAX OPERATOR")
    maxOperator(list)
    println("MAXBY OPERATOR")
    maxByOperator(list)
    println("MIN OPERATOR")
    minOperator(list)
    println("MINBY OPERATOR")
    minByOperator(list)
//    println("NONE OPERATOR")
//    noneOperator(list)
//    println("REDUCE OPERATOR")
//    reduceOperator(list)
//    println("REDUCERIGHT OPERATOR")
//    reduceRightOperator(list)
//    println("SUM OF OPERATOR")
//    sumByOperator(list)

}

/* Returns true if at least one element matches the given predicate */
fun anyOperator(list: List<Int>) {
    println(list.any { it % 2 == 0 })
    println(list.any { it > 10 })
}

/* Returns true if all elements matches the given predicate */
fun allOperator(list: List<Int>) {
    println(list.all { it % 2 == 0 })
    println(list.all { it > 10 })
}

/*Returns the number of elements matching the given predicate */
fun countOperator(list: List<Int>) {
    println(list.count { it % 2 == 0 })
    println(list.count { it > 10 })
}

/*Returns the sum of element in the list starting with the initial value  */
fun foldOperator(list: List<Int>) {
    println(list.fold(25) { total, next -> total + next })
}

/*Sam as fold but starts adding with the last element */
fun foldRightOperator(list: List<Int>) {
    println(list.foldRight(4) { total, next -> total + next })

    // 4-0, 2-(4-0), 1-(2-(4-0))
    println(listOf(1, 2, 4).foldRight(0) { total, next ->
        total - next
    })
}

/* Performs operation to each element */
fun forEachOperator(list: List<Int>) {
    println(list.forEach {
        println(it)
    })
}

/* Same as for each but you get the index */
fun forEachIndexedOperator(list: List<Int>) {
    println(list.forEachIndexed { index, value ->
        println("position $index contains a $value")
    }
    )
}

/* Returns maximum element or null if there are no elements */
fun maxOperator(list: List<Int>) {
    println(list.maxOrNull())
}


/* Returns the first element yielding the largest value of the given function or null if there are no elements.
* The element whose negative is greater */
fun maxByOperator(list: List<Int>) {
    //the element whose negative is greater
    println(list.maxByOrNull { -it })
    //the element whose positive is greater
    println(list.maxByOrNull { it })

// Get item with the maximum price in the list and return its name, if name is null return the string no products
// this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

}

/* Returns minimum element or null if there are no elements */
fun minOperator(list: List<Int>) {
    println(list.minOrNull())
}

/* Returns the first element yielding the smallest value of the given function or null if there are no elements.*/
fun minByOperator(list: List<Int>) {
    //the element whose negative is smaller
    println(list.minByOrNull { -it })
    //the element whose positive is smaller
    println(list.minByOrNull { it })

}

/* Returns true if the predicate us not matched */
fun noneOperator(list: List<Int>) {
    println(list.none { it % 7 == 0 })
}

/* Returns sum of elements */
fun reduceOperator(list: List<Int>) {
    println(list.reduce { a, b -> a + b })
}

/* Returns sum of elements, but from the last element to the first */
fun reduceRightOperator(list: List<Int>) {
    println(list.reduceRight { a, b -> a + b })
}


/* Returns the sum of all values produced by the transform function from the elements in the collection.
* sumBy replaced by sumOf */
fun sumByOperator(list: List<Int>) {
    println(list.sumOf { it * it })
}



