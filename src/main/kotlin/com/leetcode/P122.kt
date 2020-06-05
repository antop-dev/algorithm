package com.leetcode

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class P122 {
    fun maxProfit(prices: IntArray): Int {
        var sum = 0
        for (i in 1 until prices.size) {
            with(prices[i] - prices[i - 1]) {
                if (this > 0) sum += this
            }
        }
        return sum
    }
}
