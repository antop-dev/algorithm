package com.leetcode

// https://leetcode.com/problems/move-zeroes/
class P283 {

    fun moveZeroes(nums: IntArray) {
        var i = 0 // pointer
        for (j in nums.indices) { // pointer
            if (nums[j] != 0) { // swap
                val tmp = nums[i]
                nums[i++] = nums[j]
                nums[j] = tmp
            }
        }
    }

}
