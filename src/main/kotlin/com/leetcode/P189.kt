package com.leetcode

// https://leetcode.com/problems/rotate-array/
class P189 {
    fun rotate(nums: IntArray, k: Int) {
        val m = k % nums.size
        reverse(nums, 0, nums.lastIndex)
        reverse(nums, 0, m - 1)
        reverse(nums, m, nums.lastIndex)
    }

    private fun reverse(nums: IntArray, s: Int, e: Int) {
        var start = s
        var end = e
        while (start < end) {
            val tmp = nums[start]
            nums[start] = nums[end]
            nums[end] = tmp
            start++
            end--
        }
    }
}
