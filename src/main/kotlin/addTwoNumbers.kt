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
        var p1: ListNode? = l1
        var p2: ListNode? = l2
        var carry = 0
        var resultHead: ListNode? = null
        var current: ListNode? = null

        while (p1 != null || p2 != null) {
            val sum = (p1?.`val` ?: 0) + (p2?.`val` ?: 0) + carry
            carry = sum / 10
            val newNode = ListNode(sum % 10)

            if (current == null) {
                resultHead = newNode
                current = newNode
            } else {
                current.next = newNode
                current = newNode
            }

            p1 = p1?.next
            p2 = p2?.next
        }

        if (carry > 0) {
            current?.next = ListNode(carry)
        }

        return resultHead!!
    }
}
fun main(){
    val l1 = convertToLinkedList(9999)
    val l2 = convertToLinkedList(1)
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