package com.leetcode

// https://leetcode.com/problems/third-maximum-number/
class P414 {
    fun thirdMax(nums: IntArray): Int {
        var x = nums[0]
        var y: Int? = null
        var z: Int? = null

        for (i in 1 until nums.size) {
            val n = nums[i]
            when {
                n > x -> {
                    z = y
                    y = x
                    x = n
                }
                n < x && (y == null || n > y) -> {
                    z = y
                    y = n
                }
                y != null && n < y && (z == null || n > z) -> {
                    z = n
                }
            }
        }
        return z ?: x
    }
}
