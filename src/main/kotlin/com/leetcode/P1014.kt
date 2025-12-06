package com.leetcode

// https://github.com/antop-dev/algorithm/issues/701
class P1014 {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var ans = 0
        var cur = 0
        for (v in values) {
            ans = maxOf(ans, cur + v)
            cur = maxOf(cur, v) - 1
        }
        return ans
    }
}
