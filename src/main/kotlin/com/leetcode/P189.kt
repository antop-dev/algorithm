package com.leetcode

// https://leetcode.com/problems/rotate-array/
class P189 {
    fun rotate(nums: IntArray, k: Int) {
        val m = k % nums.size
        if (m == 0) return

        val copy = nums.copyOf()
        var i = m
        repeat(nums.size) {
            nums[i] = copy[it]
            i = (i + 1) % nums.size
        }
    }
}
