package linkedList

class FibNode<V : Comparable<V>>(var value: V) {
    var parent: FibNode<V>? = null
    var child: FibNode<V>? = null
    var prev: FibNode<V>? = null
    var next: FibNode<V>? = null
    var rank = 0
    var mark = false


    fun meld1(node: FibNode<V>) {
        this.prev?.next = node
        node.prev = this.prev
        node.next = this
        this.prev = node
    }

    fun meld2(node: FibNode<V>) {
        this.prev?.next = node
        node.prev?.next = this
        val temp = this.prev
        this.prev = node.prev
        node.prev = temp
    }
}

fun <V : Comparable<V>> makeHeap() = FibonacciHeap<V>()

class FibonacciHeap<V : Comparable<V>>(var node: FibNode<V>? = null) {

    fun insert(value: V): FibNode<V> {
        val newNode = FibNode(value)

        //current object of the class
        if (this.node == null) {
            newNode.next = newNode
            newNode.prev = newNode
            this.node = newNode
        } else {
            this.node!!.meld1(newNode)
            if (newNode.value < this.node!!.value) this.node = newNode
        }

        return newNode
    }

    fun union(other: FibonacciHeap<V>) {
        if (this.node == null) {
            this.node = other.node
        }
        else if (other.node != null) {
            this.node!!.meld2(other.node!!)
            if (other.node!!.value < this.node!!.value) this.node = other.node
        }
        other.node = null
    }

    fun visualize() {
        if (this.node == null) {
            println("<empty>")
            return
        }

        fun f(n: FibNode<V>, pre: String) {
            var pc = "│ "
            var x = n
            while (true) {
                if (x.next != n) {
                    print("$pre├─")
                } else {
                    print("$pre└─")
                    pc = "  "
                }
                if (x.child == null) {
                    println("╴ ${x.value}")
                } else {
                    println("┐ ${x.value}")
                    f(x.child!!, pre + pc)
                }
                if (x.next == n) break
                x = x.next!!
            }
        }
        f(this.node!!, "")
    }
}


fun main(args: Array<String>) {
    println("MakeHeap:")
    val h = makeHeap<String>()
    h.visualize()

    println("\nInsert:")
    h.insert("cat")
    h.insert("mice")
    h.visualize()

    println("\nUnion:")
    val h2 = makeHeap<String>()
    h2.insert("rat")
    h2.insert("dog")

    h.union(h2)
    h.visualize()
}


