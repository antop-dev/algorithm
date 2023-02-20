package com.leetcode

// https://github.com/antop-dev/algorithm/issues/466
class P34 {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val left = firstGreaterEqual(nums, target)
        if (left == nums.size || nums[left] != target) {
            return intArrayOf(-1, -1)
        }
        val right = firstGreaterEqual(nums, target + 1) - 1
        return intArrayOf(left, right)
    }

    private fun firstGreaterEqual(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size
        while (l < r) {
            val m = (l + r) / 2
            if (nums[m] < target) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l
    }
}
