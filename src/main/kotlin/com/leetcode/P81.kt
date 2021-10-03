package com.leetcode

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
class P81 {
    fun search(nums: IntArray, target: Int, l: Int = 0, r: Int = nums.lastIndex): Boolean {
        if (l > r) return false
        val mid = (l + r) / 2
        return nums[mid] == target
                || search(nums, target, l, mid - 1)
                || search(nums, target, mid + 1, r)
    }
}
