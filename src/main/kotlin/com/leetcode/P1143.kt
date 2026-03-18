package com.leetcode

// https://github.com/antop-dev/algorithm/issues/728
class P1143 {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val n = text1.length
        val m = text2.length
        val dp = Array(n + 1) { IntArray(m + 1) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                dp[i + 1][j + 1] = when {
                    text1[i] == text2[j] -> dp[i][j] + 1
                    else -> maxOf(dp[i][j + 1], dp[i + 1][j])
                }
            }
        }
        return dp[n][m]
    }
}
