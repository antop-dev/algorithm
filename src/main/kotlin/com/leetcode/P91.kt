package com.leetcode

// https://github.com/antop-dev/algorithm/issues/492
class P91 {
    fun numDecodings(s: String): Int {
        val sb = StringBuilder("*$s")

        val dp = IntArray(sb.length)
        dp[0] = 1

        for (i in 1 until sb.length) {
            val one = sb[i]
            val two = sb.substring(i - 1, i + 1)
            if (one != '0') dp[i] += dp[i - 1]
            if (two in "10".."26") dp[i] += dp[i - 2]
        }
        return dp.last()
    }

}
