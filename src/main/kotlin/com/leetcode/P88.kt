package com.leetcode

// https://leetcode.com/problems/merge-sorted-array/
class P88 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m - 1
        var k = n - 1
        for (p in nums1.lastIndex downTo 0) {
            nums1[p] = when {
                i == -1 -> nums2[k--]
                k == -1 -> nums1[i--]
                else -> if (nums1[i] <= nums2[k]) nums2[k--] else nums1[i--]
            }
        }
    }
}