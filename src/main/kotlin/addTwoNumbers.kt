package org.example

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution1 {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        val sum = convertToNum(l1) + convertToNum(l2)
        val fl = convertToLinkedList(sum)
        return fl
    }
}
fun main(){
    val l1 = convertToLinkedList(3426)
    val l2 = convertToLinkedList(465)
    println(l1)
    println(l2)
    val solution = Solution1()
    val result = solution.addTwoNumbers(l1, l2)
    println("Result: $result")
}

fun convertToLinkedList(num: Int): ListNode {
    var n = num
    val head = ListNode(n % 10)  // Create the head node with the last digit
    var current = head
    n /= 10

    while (n != 0) {
        val node = ListNode(n % 10)
        current.next = node
        current = node
        n /= 10
    }

    return head
}

fun convertToNum(listNode: ListNode): Int {
    var current: ListNode? = listNode
    var result = 0
    var multiplier = 1

    while (current != null) {
        result += current.`val` * multiplier
        multiplier *= 10
        current = current.next
    }

    return result
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "$`val` -> $next"
    }
}