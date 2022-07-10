package com.leetcode

// https://github.com/antop-dev/algorithm/issues/367
class P322 {

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0

        val dp = IntArray(amount + 1)
        for (i in 1 until dp.size) dp[i] = Int.MAX_VALUE

        for (coin in coins) {
            for (i in coin..amount) {
                if (dp[i - coin] == Int.MAX_VALUE) continue
                dp[i] = minOf(dp[i - coin] + 1, dp[i])
            }
        }

        return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
    }
}
