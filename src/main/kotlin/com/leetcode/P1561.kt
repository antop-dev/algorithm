package com.leetcode

// https://github.com/antop-dev/algorithm/issues/697
class P1561 {
    fun maxCoins(piles: IntArray): Int {
        piles.sortDescending()
        val n = piles.size
        val limit = n - (n / 3)
        var i = 1
        var sum = 0
        while (i < limit) {
            sum += piles[i]
            i += 2
        }
        return sum
    }
}