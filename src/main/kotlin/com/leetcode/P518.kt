package com.leetcode

// https://github.com/antop-dev/algorithm/issues/366
class P518 {
    fun change(amount: Int, coins: IntArray): Int {
        if (amount == 0) return 1

        val dp = IntArray(amount + 1)
        dp[0] = 1

        for (coin in coins) {
            for (j in coin..amount) {
                dp[j] += dp[j - coin]
            }
        }

        return dp[amount]
    }
}
