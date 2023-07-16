package com.leetcode

// https://github.com/antop-dev/algorithm/issues/275
class P1043 {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val dp = IntArray(arr.size + 1)
        for (i in 1..arr.size) {
            var maxVal = arr[i - 1]
            var maxSum = 0
            for (j in 1..k) {
                if (j > i) continue
                maxVal = maxOf(maxVal, arr[i - j])
                maxSum = maxOf(maxSum, maxVal * j + dp[i - j])
            }
            dp[i] = maxSum
        }
        return dp[arr.size]
    }
}
