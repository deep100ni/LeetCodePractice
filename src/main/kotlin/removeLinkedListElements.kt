package org.example

class Solution2 {
    fun removeLinkedListElements(head: ListNode?, num: Int): ListNode? {
        val linkedList = ListNode(0)  // 1->1->2->2->1,1
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
    fun replaceLinkedListElements(head: ListNode?, num: Int, replacement : Int): ListNode? {
        val linkedList = ListNode(0)  // 1->1->2->2->1,1,9
        linkedList.next = head
        var current = linkedList

        while (current.next != null) {
            if (current.next!!.`val` == num) {
                current.next = ListNode(replacement)
            } else {
                current = current.next!!
            }
        }

        return linkedList.next
    }
}


fun main(){
    val l1 = convertToLinkedList1(77777616)
    val num = 7
    println(l1)
    val solution = Solution2()
    val result = solution.replaceLinkedListElements(l1,num,3)
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
