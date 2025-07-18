package org.example

fun searchInsert(nums: IntArray, target: Int): Int {
    val size = nums.size
    for (i in 0 until size) {
        if (nums[i] >= target) {
            return i
        }
    }
    return size
}
fun main(){
    val nums = intArrayOf(1,3,5,7,9)
    val target = 5
    println(searchInsert(nums,target))
}