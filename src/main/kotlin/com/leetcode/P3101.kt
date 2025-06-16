package com.leetcode

// https://github.com/antop-dev/algorithm/issues/663
class P3101 {
    fun countAlternatingSubarrays(nums: IntArray): Long {
        var ans = 1L
        var size = 1L
        for (i in 1 until nums.size) {
            size = if (nums[i - 1] == nums[i]) 1 else size + 1
            ans += size
        }
        return ans
    }
}