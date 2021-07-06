package com.leetcode

// https://github.com/antop-dev/algorithm/issues/290
class P647 {
    fun countSubstrings(s: String): Int {
        var count = 0
        val dp = Array(s.length) { IntArray(s.length) }

        for (i in s.indices) {
            dp[i][i] = 1
            count++
        }

        for (i in 1 until s.length) {
            if (s[i - 1] == s[i]) {
                dp[i - 1][i] = 1
                count++
            }
        }

        for (start in 2 until s.length) {
            var i = 0
            var j = start
            while (j < s.length) {
                if (s[i] == s[j] && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1
                    count++
                }
                i++
                j++
            }
        }

        return count
    }


}
