package org.example

fun plusOne(digits: IntArray): IntArray {
    var lastElement = digits.last()
    var duplicate = lastElement
    if (lastElement >= 9){
        lastElement.plus(lastElement/10)
        lastElement.plus(duplicate % 10)
    }else{
        lastElement++
    }
    return digits
}