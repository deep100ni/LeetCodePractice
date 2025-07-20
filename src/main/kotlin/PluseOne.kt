package org.example

fun plusOne(digits: IntArray): IntArray {
    var resNum = intArrayToNumber(digits)
    resNum = resNum + 1
    var resArr = numberToIntArray(resNum)
    return resArr
}

fun numberToIntArray(num: Int): IntArray {
    return num.toString().map { it.toString().toInt() }.toIntArray()
}

fun intArrayToNumber(arr: IntArray): Int {
    return arr.joinToString("").toInt()
}