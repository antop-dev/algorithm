package com.leetcode

// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
class P1475 {
    fun finalPrices(prices: IntArray): IntArray {
        with(prices) {
            for (i in indices) {
                for (j in i + 1 until size) {
                    if (this[i] >= this[j]) {
                        this[i] -= this[j]
                        break
                    }
                }
            }
            return this
        }
    }
}
