package com.leetcode

// https://github.com/antop-dev/algorithm/issues/707
class P2799 {
    fun countCompleteSubarrays(nums: IntArray): Int {
        var ans = 0
        val k = nums.toSet().size
        for (i in nums.indices) {
            val hash = HashMap<Int, Int>()
            for (j in i until nums.size) {
                hash[nums[j]] = hash[nums[j]]?.let { it + 1 } ?: 1
                if (hash.size == k) {
                    ans++
                }
            }
        }
        return ans
    }
}