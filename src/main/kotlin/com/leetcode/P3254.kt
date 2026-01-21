package com.leetcode

// https://github.com/antop-dev/algorithm/issues/716
class P3254 {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        if (k == 1) return nums

        val n = nums.size
        val ans = IntArray(n - k + 1) { -1 }
        var last = -k
        for (i in 1 until n) {
            if (nums[i] - nums[i - 1] != 1) {
                last = i - 1
            }
            if (i >= k - 1 && last < i - k + 1) {
                ans[i - k + 1] = nums[i]
                continue
            }
        }
        return ans
    }
}
