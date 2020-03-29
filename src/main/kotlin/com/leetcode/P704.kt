package com.leetcode

// https://leetcode.com/problems/binary-search/
class P704 {
    fun search(nums: IntArray, target: Int): Int {
        var s = 0
        var e = nums.size - 1
        while (s <= e) {
            val m = (s + e) / 2
            when {
                target < nums[m] -> e = m - 1
                target > nums[m] -> s = m + 1
                else -> return m
            }
        }
        return -1
    }
}