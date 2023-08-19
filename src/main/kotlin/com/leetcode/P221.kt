package com.leetcode

// https://github.com/antop-dev/algorithm/issues/501
class P221 {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        var max = 0
        val m = matrix.size
        val n = matrix[0].size

        val dp = Array(m + 1) {
            IntArray(n + 1)
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] = min(
                        dp[i][j],
                        dp[i + 1][j],
                        dp[i][j + 1]
                    ) + 1
                    if (dp[i + 1][j + 1] > max) {
                        max = dp[i + 1][j + 1]
                    }
                }
            }
        }
        return max * max
    }

    private fun min(x: Int, y: Int, z: Int) = minOf(minOf(x, y), z)
}
