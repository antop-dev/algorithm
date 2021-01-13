package com.leetcode

// https://leetcode.com/problems/majority-element/
class P169 {
    fun majorityElement(nums: IntArray): Int {
        var majority = nums[0]
        var count = 1
        for (i in 1 until nums.size) {
            if (majority == nums[i]) {
                count++
            } else {
                count--
                if (count == 0) {
                    majority = nums[i]
                    count = 1
                }
            }
        }
        return majority
    }
}
