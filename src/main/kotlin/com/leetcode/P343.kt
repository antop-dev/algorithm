package com.leetcode

import kotlin.math.pow

// https://github.com/antop-dev/algorithm/issues/278
class P343 {
    fun integerBreak(n: Int): Int {
        if (n <= 3) return n - 1

        val r = n % 3
        var d = n / 3
        var ans = 1
        when (r) {
            1 -> {
                d--
                ans = 4
            }
            2 -> {
                ans = 2
            }
        }

        return (3.0.pow(d.toDouble()) * ans).toInt()
    }
}
