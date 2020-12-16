package com.leetcode

// https://leetcode.com/problems/delete-operation-for-two-strings/
class P583 {
    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) {
            Array(word2.length + 1) { 0 }
        }
        for (i in 0..word1.length) {
            for (j in 0..word2.length) {
                when {
                    i == 0 || j == 0 -> dp[i][j] = i + j
                    word1[i - 1] == word2[j - 1] -> dp[i][j] = dp[i - 1][j - 1]
                    else -> dp[i][j] = minOf(dp[i - 1][j], dp[i][j - 1]) + 1
                }
            }
        }
        return dp.last().last()
    }
}
