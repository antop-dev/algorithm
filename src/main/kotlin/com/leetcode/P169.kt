package com.leetcode

// https://github.com/antop-dev/algorithm/issues/145
class P169 {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }

        return candidate
    }
}
