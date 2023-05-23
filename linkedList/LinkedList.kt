package linkedList

open class LinkedList<T> {

    var head: Node<T>? = null
    var tail: Node<T>? = null

    private var size = 0

    private fun isEmpty() = size == 0


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

    fun pop(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next

        if (isEmpty()) {
            tail = null
        }
        //returns the popped item
        return result
    }

    fun removeLast(): T? {
        //if head is null return null
        val head = head ?: return null

        //if the list has one node, then remove last is functionally equal to pop
        if (head.next == null) return pop()

        size--

        var prev = head
        var current = head

        var next = current.next

        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value
    }


    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail) {
            tail = node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }

    //Return node at the entry of a cycle and prints true if it's a cycle linked list
    fun isCycle(): Node<T>? {
        var slowPtr: Node<T>? = head
        var fastPtr: Node<T>? = head

        var met = false

        while (fastPtr != null) {
            fastPtr = fastPtr.next?.next
            slowPtr = slowPtr?.next
            if (slowPtr == fastPtr) {
                met = true
            }
        }

        println("Linked list is Cyclic")
        println(met)

        if (met) {
            slowPtr = head
            while (slowPtr != fastPtr) {
                slowPtr = slowPtr?.next
                fastPtr = fastPtr?.next
            }
        }

        return slowPtr
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

    values.append(4).append(5).append(6)
    println(values)

    val middleNode = values.nodeAt(3)

    values.insert(2345, middleNode)
    println(values)

    values.pop()
    println(values)

    values.removeLast()
    println(values)

    values.removeAfter(middleNode)
    println(values)

    values.isCycle()
    println(values)

}