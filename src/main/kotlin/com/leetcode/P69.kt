package com.leetcode

// https://leetcode.com/problems/sqrtx/
class P69 {
    fun mySqrt(x: Int): Int {
        var s: Long = 0
        var e: Long = x.toLong()

        while (s < e) {
            var m = (s + e) / 2

            println("s = $s, e = $e, m = $m")

            with(m * m) {
                when {
                    this == x.toLong() -> return m.toInt()
                    this > x.toLong() -> e = m - 1
                    this < x.toLong() -> s = m + 1
                }
            }

            println("  -> s = $s, e = $e")
        }

        if (s * s > x.toLong()) {
            s -= 1
        }
        return s.toInt()
    }
}