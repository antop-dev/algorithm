package com.leetcode

// https://github.com/antop-dev/algorithm/issues/735
class P2294 {
    fun partitionArray(nums: IntArray, k: Int): Int {
        nums.sort()
        var p = 1
        var prev = nums[0]
        for (i in 1 until nums.size) {
            val num = nums[i]
            if (num - prev > k) {
                p++
                prev = num
            }
        }
        return p
    }
}
