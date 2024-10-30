package com.leetcode

// https://github.com/antop-dev/algorithm/issues/597
class P2944 {
    fun minimumCoins(prices: IntArray): Int {
        val n = prices.size
        val dp = IntArray(n + 1)
        dp[n - 1] = prices[n - 1]

        for (i in n - 2 downTo 0) {
            var minCoins = Int.MAX_VALUE
            for (j in i + 1..minOf(i + 2 + i, n)) {
                minCoins = minOf(minCoins, dp[j])
            }
            dp[i] = prices[i] + minCoins
        }
        return dp[0]
    }
}
