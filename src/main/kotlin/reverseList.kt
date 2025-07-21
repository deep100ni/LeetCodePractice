package org.example

fun reverseList(head: ListNode?): ListNode? {
    var curr = head
    var prev: ListNode? = null

    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }

    return prev
}