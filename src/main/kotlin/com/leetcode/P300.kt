package com.leetcode

// https://github.com/antop-dev/algorithm/issues/417
class P300 {
    fun lengthOfLIS(nums: IntArray): Int {
        val n = nums.size
        val max = IntArray(n) { 1 }
        val dp = IntArray(n).apply { this[0] = 1 }

        for (i in 1 until n) {
            for (j in i - 1 downTo 0) {
                if (nums[j] < nums[i]) {
                    max[i] = maxOf(max[i], max[j] + 1)
                }
            }
            dp[i] = maxOf(dp[i - 1], max[i])
        }

        return dp.last()
    }
}