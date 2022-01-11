package com.leetcode

// https://github.com/antop-dev/algorithm/issues/367
class P322 {

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0

        val dp = IntArray(amount + 1)
        for (i in 1 until dp.size) dp[i] = Int.MAX_VALUE

        for (i in coins.indices) {
            for (j in coins[i]..amount) {
                if (dp[j - coins[i]] != Int.MAX_VALUE) {
                    dp[j] = minOf(dp[j - coins[i]] + 1, dp[j])
                }
            }
        }

        return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
    }
}
