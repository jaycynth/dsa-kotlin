package linkedList

class LinkedList<T> {

    var head: Node<T>? = null
    var tail: Node<T>? = null

    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    // Inserting at the beginning of the list
    fun push(value: T) :LinkedList<T>{
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++

        return this
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

}

fun main() {

    val values: LinkedList<Int> = LinkedList()

    values.push(1).push(2).push(3)

    println(values)
}