package com.leetcode

// https://leetcode.com/problems/climbing-stairs/
class P70 {
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1

        val dp = IntArray(n + 1) .apply {
            this[1] = 1
            this[2] = 2
        }

        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]
    }
}
