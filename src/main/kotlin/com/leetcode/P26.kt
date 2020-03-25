package com.leetcode

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class P26 {
    fun removeDuplicates(nums: IntArray): Int {
        println("Given nums = ${nums.contentToString()}")
        if (nums.isEmpty()) return 0
        var i = 0
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                i++
                nums[i] = nums[j]
            }
        }
        println("Result nums = ${nums.contentToString()}")
        return i + 1
    }
}