package com.leetcode

// https://leetcode.com/problems/search-in-rotated-sorted-array/
class P33 {
    fun search(nums: IntArray, target: Int): Int {
        return search(nums, target, 0, nums.lastIndex)
    }

    fun search(nums: IntArray, target: Int, l: Int, r: Int): Int {
        if (l > r) return -1
        val mid = (l + r) / 2

        return when (target) {
            nums[mid] -> mid
            else -> maxOf(search(nums, target, l, mid - 1), search(nums, target, mid + 1, r))
        }
    }
}
