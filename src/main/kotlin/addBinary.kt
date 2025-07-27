package org.example

fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0

    return buildString {
        while (i >= 0 || j >= 0 || carry > 0) {
            val digitA = if (i >= 0) a[i] - '0' else 0
            val digitB = if (j >= 0) b[j] - '0' else 0

            val sum = digitA + digitB + carry
            append(sum % 2)
            carry = sum / 2

            i--
            j--
        }
    }.reversed()
}
fun main(){
    val a = "1"
    val b = "1"
    println(addBinary(a,b))
}