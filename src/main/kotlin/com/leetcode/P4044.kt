package com.leetcode

// https://github.com/antop-dev/algorithm/issues/790
class P4044 {
    fun countGoodRotations(nums: IntArray): Int {
        val n = nums.size
        val half = n / 2
        var first = 0L
        var total = 0L
        for (i in nums.indices) {
            if (i < half) {
                first += nums[i]
            }
            total += nums[i]
        }
        // sliding window
        var ans = 0
        repeat(n) { i ->
            if (first > total - first) {
                ans++
            }
            first += nums[(i + half) % n] - nums[i]
        }
        return ans
    }
}
