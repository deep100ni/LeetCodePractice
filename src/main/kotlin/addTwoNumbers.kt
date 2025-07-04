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
        var a: ListNode? = l1
        var b: ListNode? = l2
        var carry = 0
        var curr: ListNode? = null
        var res: ListNode? = null
        while (a != null || b != null){
            val sum = (a?.`val` ?: 0) + (b?.`val` ?: 0) + carry
            val node = ListNode(sum % 10)
            carry = sum/10
            if (curr == null){
                curr  = node
                res = node
            }else{
                curr.next = node
                curr = node
            }
            a = a?.next
            b = b?.next
        }
        if (carry > 0)curr!!.next = ListNode(carry)
        return res!!


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