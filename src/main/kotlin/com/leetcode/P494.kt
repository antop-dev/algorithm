package com.leetcode

// https://github.com/antop-dev/algorithm/issues/528
class P494 {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        val sum = nums.sum()
        if (target < -sum || target > sum) return 0

        var dp = IntArray(2 * sum + 1)
        dp[0 + sum] = 1

        for (i in nums.indices) {
            val next = IntArray(2 * sum + 1)
            for (k in 0 until 2 * sum + 1) {
                if (dp[k] == 0) continue
                next[k + nums[i]] += dp[k]
                next[k - nums[i]] += dp[k]
            }
            dp = next
        }
        return dp[sum + target]
    }
}
