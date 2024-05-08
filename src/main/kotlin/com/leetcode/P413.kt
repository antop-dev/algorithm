package com.leetcode

// https://github.com/antop-dev/algorithm/issues/554
class P413 {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        if (nums.size < 3) return 0
        val dp = IntArray(nums.size)

        var ans = 0
        for (i in 2 until dp.size) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = 1 + dp[i - 1]
            }
            ans += dp[i]
        }
        return ans
    }
}
