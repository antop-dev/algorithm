package com.leetcode

// https://github.com/antop-dev/algorithm/issues/382
class P120 {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val dp = triangle.map { it.toMutableList() }.toMutableList()
        for (i in dp.lastIndex - 1 downTo 0) {
            for (j in dp[i].indices) {
                dp[i][j] += minOf(dp[i + 1][j], dp[i + 1][j + 1])
            }
        }
        return dp[0][0]
    }
}
