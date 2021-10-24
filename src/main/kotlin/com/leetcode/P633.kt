package com.leetcode

import kotlin.math.sqrt

// https://github.com/antop-dev/algorithm/issues/341
class P633 {
    fun judgeSquareSum(c: Int): Boolean {
        val C = c.toLong()
        var a = 0L
        var b = sqrt(c.toDouble()).toLong()
        while (a <= b) {
            val v = (a * a) + (b * b)
            if (v == C) return true
            if (v < C) a++ else b--
        }
        return false
    }
}
