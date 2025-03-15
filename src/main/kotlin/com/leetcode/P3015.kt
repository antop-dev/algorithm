package com.leetcode

import kotlin.math.abs
import kotlin.math.min

// https://github.com/antop-dev/algorithm/issues/634
class P3015 {
    fun countOfPairs(n: Int, x: Int, y: Int): IntArray {
        val ans = IntArray(n)
        for (i in 1..n) {
            for (j in i + 1..n) {
                // a : i ~ j 거리
                // b : i ~ x(or y) ~ y(or x) ~ j 거리
                val a = j - i
                val b = min(
                    abs(x - i) + 1 + abs(j - y), // i ~ x + y ~ j
                    abs(y - i) + 1 + abs(j - x), // i ~ y + x + j
                )
                // B 경로와 B 경로 중 짧은 거리
                val v = min(a, b)
                ans[v - 1] += 2
            }
        }
        return ans
    }

}
