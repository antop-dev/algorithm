package com.leetcode

// https://github.com/antop-dev/algorithm/issues/40
class P26 {
    fun removeDuplicates(nums: IntArray): Int {
        var anchor = 0
        for (i in 1 until nums.size) {
            if (nums[anchor] == nums[i]) continue
            nums[++anchor] = nums[i]
        }
        return anchor + 1
    }
}
