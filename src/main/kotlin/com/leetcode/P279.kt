package com.leetcode

import kotlin.math.sqrt

// https://github.com/antop-dev/algorithm/issues/495
class P279 {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[n] = 0

        for (v in dp.indices.reversed()) {
            // 가능한 가장 큰 제곱수
            val sqrt = sqrt(v.toDouble()).toInt()
            for (x in sqrt downTo 1) {
                val y = v - (x * x)
                if (dp[v] + 1 < dp[y]) {
                    dp[y] = dp[v] + 1
                }
            }
        }
        return dp[0]
    }
}
