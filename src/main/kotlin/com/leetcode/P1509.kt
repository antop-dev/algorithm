package com.leetcode

// https://github.com/antop-dev/algorithm/issues/658
class P1509 {
    fun minDifference(nums: IntArray): Int {
        val n = nums.size
        if (n <= 4) return 0
        nums.sort()

        var ans = nums.last() - nums.first()
        for (i in 0..3) {
            val j = n - 4 + i
            ans = minOf(ans, nums[j] - nums[i])
        }
        return ans
    }
}