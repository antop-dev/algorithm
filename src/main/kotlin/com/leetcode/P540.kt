package com.leetcode

// https://github.com/antop-dev/algorithm/issues/247
class P540 {
    fun singleNonDuplicate(nums: IntArray): Int {
        var i = nums.lastIndex
        while (i > 0) {
            if (nums[i - 1] != nums[i]) return nums[i]
            else i -= 2
        }
        return nums[0]
    }
}
