package org.example

class Solution2 {
    fun removeLinkedListElements(head: ListNode?, num: Int): ListNode? {
        val linkedList = ListNode(0)
        linkedList.next = head
        var current = linkedList

        while (current.next != null) {
            if (current.next!!.`val` == num) {
                current.next = current.next!!.next
            } else {
                current = current.next!!
            }
        }

        return linkedList.next
    }
}


fun main(){
    val l1 = convertToLinkedList1(76198716)
    val num = 1
    println(l1)
    val solution = Solution2()
    val result = solution.removeLinkedListElements(l1,num)
    println("Result: $result")
}

fun convertToLinkedList1(num: Int): ListNode {
    val digits = num.toString().map { it - '0' }
    val head = ListNode(digits[0])
    var current = head

    for (i in 1 until digits.size) {
        val node = ListNode(digits[i])
        current.next = node
        current = node
    }

    return head
}
