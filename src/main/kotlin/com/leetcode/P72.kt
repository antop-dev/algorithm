package com.leetcode

// https://github.com/antop-dev/algorithm/issues/463
class P72 {
    fun minDistance(word1: String, word2: String): Int {
        val len1 = word1.length
        val len2 = word2.length
        val dp = Array(len1 + 1) { IntArray(len2 + 1) { 0 } }

        for (i in 0..len1) dp[i][0] = i
        for (i in 0..len2) dp[0][i] = i

        for (i in 1..len1) {
            for (j in 1..len2) {
                dp[i][j] = when {
                    word1[i - 1] == word2[j - 1] -> dp[i - 1][j - 1]
                    else -> 1 + minOf(dp[i - 1][j - 1], minOf(dp[i][j - 1], dp[i - 1][j]))
                }
            }
        }

        return dp[len1][len2]
    }

}
