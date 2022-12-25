package com.leetcode

// https://github.com/antop-dev/algorithm/issues/449
class P2099 {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        return IntArray(nums.size) { it }
            .sortedByDescending { nums[it] }
            .take(k)
            .sorted()
            .map { nums[it] }
            .toIntArray()
    }
}
