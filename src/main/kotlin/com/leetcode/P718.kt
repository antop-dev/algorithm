package com.leetcode

// https://github.com/antop-dev/algorithm/issues/352
class P718 {
    fun findLength(nums1: IntArray, nums2: IntArray): Int {
        var answer = 0
        val dp = Array(nums1.size + 1) { IntArray(nums2.size + 1) }
        for (i in nums1.indices.reversed()) {
            for (j in nums2.indices.reversed()) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1
                    if (dp[i][j] > answer) {
                        answer = dp[i][j]
                    }
                }
            }
        }
        return answer
    }
}
