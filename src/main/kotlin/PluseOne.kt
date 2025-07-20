package org.example

fun plusOne(digits: IntArray): IntArray {
    for(i in digits.size - 1 downTo 0){
        if(digits[i] < 9){
            digits[i]++
            return digits
        }else{
            digits[i] = 0
        }
    }
    val arr = IntArray(digits.size +1)
    arr[0] = 1
    return arr
}

