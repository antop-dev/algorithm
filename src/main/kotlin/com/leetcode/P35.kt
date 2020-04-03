package com.leetcode

// https://leetcode.com/problems/search-insert-position/
class P35 {
    fun searchInsert(nums: IntArray, target: Int) = search(nums, 0, nums.lastIndex, target)

    private fun search(nums: IntArray, s: Int, e: Int, target: Int): Int {
        if (s < e) {
            val m = (s + e) / 2
            return when {
                target < nums[m] -> search(nums, s, e - 1, target)
                target > nums[m] -> search(nums, s + 1, e, target)
                else -> return m
            }
        }
        // s == e
        return when {
            target > nums[s] -> s + 1
            else -> s
        }
    }

}