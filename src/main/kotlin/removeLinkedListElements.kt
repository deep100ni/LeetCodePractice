package org.example

class Solution2 {
    fun addTwoNumbers(head: ListNode?, num: Int): ListNode? {
        var p1: ListNode? = head
        var resultHead: ListNode? = null
        while (p1 != null){
            if (p1.`val` == num){
               p1 = p1.next!!
            }else{
                resultHead = p1
            }
        }
        return resultHead
    }

}

fun main(){
    val l1 = convertToLinkedList1(76198716)
    val num = 1
    val solution = Solution2()
    val result = solution.addTwoNumbers(l1,num)
    println(l1)
    println("Result: $result")
}

fun convertToLinkedList1(number: Int): ListNode? {
    val digits = number.toString().map { it - '0' }
    val dummy = ListNode(0)
    var current = dummy
    for (d in digits) {
        current.next = ListNode(d)
        current = current.next!!
    }
    return dummy.next
}


