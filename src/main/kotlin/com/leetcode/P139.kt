package com.leetcode

// https://github.com/antop-dev/algorithm/issues/281
class P139 {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val dp = Array(s.length + 1) { false }
        dp[dp.lastIndex] = true

        for (i in s.lastIndex downTo 0) {
            for (w in wordDict) {
                if (i + w.length <= s.length && s.substring(i, i + w.length) == w) {
                    dp[i] = dp[i + w.length]
                }
                if (dp[i]) break
            }
        }
        return dp[0]
    }

}
