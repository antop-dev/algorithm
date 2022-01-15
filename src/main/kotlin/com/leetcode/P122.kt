package com.leetcode

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class P122 {
    fun maxProfit(prices: IntArray): Int {
        var sum = 0
        for (i in 1 until prices.size) {
            val diff = prices[i] - prices[i - 1]
            if(diff > 0) sum += diff
        }
        return sum
    }
}
