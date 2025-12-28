package com.leetcode

// https://github.com/antop-dev/algorithm/issues/707
class P2799 {
    fun countCompleteSubarrays(nums: IntArray): Int {
        var ans = 0
        val k = nums.toSet().size
        for (i in nums.indices) {
            val set = mutableSetOf<Int>()
            for (j in i until nums.size) {
                set += nums[j]
                if (set.size == k) {
                    ans++
                }
            }
        }
        return ans
    }
}