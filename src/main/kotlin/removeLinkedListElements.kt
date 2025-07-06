package org.example

class Solution2 {
    fun addTwoNumbers(head : ListNode,num : Int): ListNode? {
        var p1: ListNode? = head
        var resultHead: ListNode? = null
        while (p1 != null){
            if (p1.'val' == num){
                p1 = p1.next!!
            }else{
                resultHead = p1
            }
        }
        return resultHead
    }

}