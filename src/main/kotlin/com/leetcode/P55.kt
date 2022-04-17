package com.leetcode

// https://github.com/antop-dev/algorithm/issues/388
class P55 {
    fun canJump(nums: IntArray, i: Int = 0): Boolean {
        val dp = BooleanArray(nums.size)
        dp[dp.lastIndex] = true

        for (i in dp.lastIndex - 1 downTo 0) {
            for (j in i + 1..minOf(i + nums[i], dp.lastIndex)) {
                if (dp[j]) {
                    dp[i] = true
                    break
                }
            }
        }

        return dp[0]
    }
}
