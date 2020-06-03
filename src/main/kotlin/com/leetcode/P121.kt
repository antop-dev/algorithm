package com.leetcode

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class P121 {
    fun maxProfit(prices: IntArray): Int {
        var minprice = Int.MAX_VALUE
        var maxprofit = 0
        for (i in prices.indices) {
            if (prices[i] < minprice) minprice = prices[i]
            else if (prices[i] - minprice > maxprofit) maxprofit = prices[i] - minprice
        }
        return maxprofit
    }
}
