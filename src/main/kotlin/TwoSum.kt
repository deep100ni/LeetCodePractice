package org.example

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {
            val complement = target - num
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, index)
            }
            map[num] = index
        }

        return intArrayOf()
    }
}

fun main() {
    val a = arrayOf(2, 7, 11, 15)
    val t = 9
    val solution = Solution()
    val result = solution.twoSum(a.toIntArray(), t)
    println(result.joinToString(", "))
}