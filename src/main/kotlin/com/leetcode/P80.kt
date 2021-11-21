package com.leetcode

// https://github.com/antop-dev/algorithm/issues/350
class P80 {
    fun removeDuplicates(nums: IntArray): Int {
        var anchor = 0
        var count = 1
        for (i in 1 until nums.size) {
            if (nums[anchor] == nums[i]) {
                if (count >= 2) continue
                count++
            } else {
                count = 1
            }
            nums[++anchor] = nums[i]
        }
        return anchor + 1
    }
}
