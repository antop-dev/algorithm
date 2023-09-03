package com.leetcode

// https://github.com/antop-dev/algorithm/issues/382
class P120 {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        // 변경 가능한 배열 선언
        val dp = Array(triangle.size) { i ->
            IntArray(i + 1) { j -> triangle[i][j] }
        }
        // 합을 위로 올린다.
        for (i in dp.lastIndex - 1 downTo 0) {
            for (j in dp[i].indices) {
                dp[i][j] += minOf(dp[i + 1][j], dp[i + 1][j + 1])
            }
        }
        // 최상위(0,0)에 있는 수가 답
        return dp[0][0]
    }
}
