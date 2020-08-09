package com.leetcode

// https://leetcode.com/problems/arranging-coins/
class P441 {
    fun arrangeCoins(n: Int): Int {
        var m = n
        var i = 1
        while (i <= m) m -= i++
        return i - 1
    }
}
