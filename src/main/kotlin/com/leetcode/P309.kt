package com.leetcode

// https://github.com/antop-dev/algorithm/issues/369
class P309 {
    fun maxProfit(prices: IntArray): Int {
        val buy = IntArray(prices.size).apply { this[0] = -prices[0] }
        val sell = IntArray(prices.size)
        val cool = IntArray(prices.size)

        for (i in 1 until prices.size) {
            val k = i - 1
            val price = prices[i]
            buy[i] = maxOf(buy[k], cool[k] - price)
            sell[i] = maxOf(sell[k], buy[k] + price)
            cool[i] = maxOf(cool[k], sell[k])
        }

        return sell.last()
    }
}
