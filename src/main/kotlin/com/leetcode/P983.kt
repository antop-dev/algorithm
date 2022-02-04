package com.leetcode


// https://github.com/antop-dev/algorithm/issues/370
class P983 {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val dp = IntArray(365 + 30 + 1)
        val set = mutableSetOf<Int>()
        for (i in days) set += i
        for (i in 365 downTo 1) {
            if (i !in set) {
                dp[i] = dp[i + 1]
                continue
            }
            dp[i] = minOf(dp[i + 1] + costs[0], dp[i + 7] + costs[1])
            dp[i] = minOf(dp[i], dp[i + 30] + costs[2])
        }
        return dp[1]
    }

}
