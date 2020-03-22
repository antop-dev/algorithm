package com.leetcode

/**
 * https://leetcode.com/problems/two-sum/
 */
class P1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        println("Given nums = ${nums.contentToString()}, target = $target")

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val sum = nums[i] + nums[j]
                if (sum == target) {
                    println("Because nums[$i] + nums[$j] = ${nums[i]} + ${nums[j]} = $sum")
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf(0, 0)
    }
}