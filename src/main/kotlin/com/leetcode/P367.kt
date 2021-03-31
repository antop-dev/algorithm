package com.leetcode

// https://leetcode.com/problems/valid-perfect-square/
class P367 {
    fun isPerfectSquare(num: Int): Boolean {
        val n = num.toLong()
        if (num == 1) return true
        var s: Long = 1
        var e: Long = n / 2
        while (s <= e) {
            val m = (s + e) / 2
            when {
                m * m == n -> return true
                m * m < n -> s = m + 1
                else -> e = m - 1
            }
        }
        return false
    }
}
