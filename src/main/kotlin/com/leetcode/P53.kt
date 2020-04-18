package com.leetcode

import kotlin.math.max

// https://leetcode.com/problems/maximum-subarray/
class P53 {
    fun maxSubArray(nums: IntArray): Int {
        val dp = IntArray(nums.size).apply { this[0] = nums[0] }
        for (i in 1..nums.lastIndex) {
            dp[i] = max(nums[i], dp[i - 1] + nums[i])
        }
        return dp.max()!!
    }
}