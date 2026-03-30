package com.leetcode

// https://github.com/antop-dev/algorithm/issues/723
class P837 {
    fun new21Game(n: Int, k: Int, maxPts: Int): Double {
        if (k == 0 || n >= k + maxPts) {
            return 1.0
        }

        var wSum = 1.0
        var res = 0.0
        val dp = DoubleArray(n + 1)
        dp[0] = 1.0

        for (i in 1..n) {
            dp[i] = wSum / maxPts
            if (i < k) {
                wSum += dp[i]
            } else {
                res += dp[i]
            }
            if (i - maxPts >= 0) {
                wSum -= dp[i - maxPts]
            }
        }

        return res
    }
}
