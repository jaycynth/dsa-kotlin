package linkedList

class LinkedList<T> {

    var head: Node<T>? = null
    var tail: Node<T>? = null

    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    // Inserting at the beginning of the list
    fun push(value: T): LinkedList<T> {
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++

        return this
    }

    fun append(value: T): LinkedList<T> {
        //append on an empty list if functionally identical to push
        if (isEmpty()) {
            push(value)
            return this
        }

        tail?.next = Node(value = value)
        tail = tail?.next
        size++

        return this
    }

    fun nodeAt(pos: Int): Node<T> {
        var currentNode = head

        var currentIndex = 0
        while (currentNode != null && currentIndex < pos) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode!!
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
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

    values.append(9).push(10)
    println(values)

    values.push(1).push(2).push(3)
    println(values)

    values.append(11).append(12)
    println(values)
}