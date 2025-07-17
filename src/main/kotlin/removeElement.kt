package org.example

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    for(i in nums.indices){
        if (nums[i] != `val`){
            nums[k] = nums[i]
            k++
        }
    }
    return k
}

fun main(){
    val nums = intArrayOf(3,2,2,3)
    val e = 2
    println(removeElement(nums,e))
}