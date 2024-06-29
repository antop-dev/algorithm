package com.leetcode

// https://github.com/antop-dev/algorithm/issues/567
class P2740 {
    fun findValueOfPartition(nums: IntArray): Int {
        nums.sort()
        var ans = 1_000_000_000
        for (i in 0 until nums.size - 1) {
            val diff = nums[i + 1] - nums[i]
            ans = minOf(ans, diff)
        }
        return ans
    }
}
