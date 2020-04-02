package com.leetcode

// https://leetcode.com/problems/search-a-2d-matrix/
class P74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (m in matrix) {
            if (m.isEmpty()) continue
            if (target in m[0]..m[m.lastIndex]) {
                if (binarySearch(m, 0, m.lastIndex, target) != -1) return true
            }
        }
        return false
    }

    private fun binarySearch(nums: IntArray, s: Int, e: Int, target: Int): Int {
        if (s <= e) {
            val m = (s + e) / 2
            return when {
                target < nums[m] -> binarySearch(nums, s, e - 1, target)
                target > nums[m] -> binarySearch(nums, s + 1, e, target)
                else -> return m
            }
        }
        return -1
    }
}