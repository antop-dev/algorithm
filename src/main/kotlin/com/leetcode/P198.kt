package com.leetcode

// https://github.com/antop-dev/algorithm/issues/400
class P198 {
    fun rob(nums: IntArray): Int {
        val dp = IntArray(nums.size + 1)
        dp[1] = nums[0]

        for (i in 2 until dp.size) {
            // 털지 않는 경우(dp[i - 1]) or 터는 경우(dp[i - 2] + nums[i - 1])
            dp[i] = maxOf(dp[i - 1], dp[i - 2] + nums[i - 1])
        }

        return dp.last()
    }
}
