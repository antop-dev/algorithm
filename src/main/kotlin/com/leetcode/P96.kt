package com.leetcode

// https://github.com/antop-dev/algorithm/issues/384
class P96 {
    fun numTrees(n: Int): Int {
        val dp = IntArray(n + 1);
        dp[0] = 1
        dp[1] = 1

        for (i in 2..n) {
            var ai = 0
            for (j in 0 until i) {
                ai += dp[j] * dp[i - j - 1]
            }
            dp[i] = ai
        }

        return dp[n]
    }
}
