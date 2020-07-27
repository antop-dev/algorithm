package com.leetcode

// https://leetcode.com/problems/median-of-two-sorted-arrays/
class P4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val array = Array(nums1.size + nums2.size) { 0 }
        var i = 0
        var j = 0
        for (k in array.indices) {
            array[k] = when {
                i == nums1.size -> nums2[j++]
                j == nums2.size -> nums1[i++]
                else -> if (nums1[i] < nums2[j]) nums1[i++] else nums2[j++]
            }
        }

        val e = array.size / 2
        val s = (if (array.size % 2 == 0) e - 1 else e)
        return (array[s] + array[e]) / 2.0
    }
}
