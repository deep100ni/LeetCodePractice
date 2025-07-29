package org.example

fun isStrobogrammatic(num: String): Boolean {
    val map = mapOf(
        '0' to '0',
        '1' to '1',
        '8' to '8',
        '6' to '9',
        '9' to '6'
    )

    var left = 0
    var right = num.length - 1

    while (left <= right) {
        val leftChar = num[left]
        val rightChar = num[right]

        if (map[leftChar] != rightChar) return false

        left++
        right--
    }

    return true
}
fun main(){
    val num = "689"
    println(isStrobogrammatic(num))
}