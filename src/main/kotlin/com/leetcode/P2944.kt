package com.leetcode

// https://github.com/antop-dev/algorithm/issues/597
class P2944 {
    fun minimumCoins(prices: IntArray): Int {
        if (prices.size == 1) {
            return prices.first()
        }

        val n = prices.size
        val dp = IntArray(n) { 1_000_001 }
        dp[0] = prices.first()
        dp[1] = prices.first()

        for (i in 1 until n) {
            val cost = dp[i - 1] + prices[i]
            for (j in i until minOf(n, i + i + 2)) {
                if (cost < dp[j]) {
                    dp[j] = cost
                }
            }
        }
        return dp.last()
    }
}
