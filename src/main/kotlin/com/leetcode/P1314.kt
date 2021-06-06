package com.leetcode

// https://github.com/antop-dev/algorithm/issues/277
class P1314 {
    fun matrixBlockSum(mat: Array<IntArray>, k: Int): Array<IntArray> {
        val dp = Array(mat.size) { i -> IntArray(mat[i].size) }.apply {
            for (i in mat.indices) {
                for (j in mat[0].indices) {

                }
            }
            this[0][0] = mat[0][0]
            for (i in 1 until mat.size) this[i][0] = this[i - 1][0] + mat[i][0]
            for (i in 1 until mat[0].size) this[0][i] = this[0][i - 1] + mat[0][i]
            for (i in 1 until mat.size) {
                for (j in 1 until mat[i].size) {
                    this[i][j] = this[i - 1][j] + this[i][j - 1] + mat[i][j] - this[i - 1][j - 1]
                }
            }
        }

        return Array(mat.size) { i -> IntArray(mat[i].size) }.apply {
            for (i in mat.indices) {
                for (j in mat[i].indices) {
                    val y = minOf(i + k, dp.lastIndex)
                    val x = minOf(j + k, dp[i].lastIndex)
                    this[i][j] = dp[y][x]

                    val r = i - k - 1
                    val c = j - k - 1
                    if (r >= 0) this[i][j] -= dp[r][x]
                    if (c >= 0) this[i][j] -= dp[y][c]
                    if (r >= 0 && c >= 0) this[i][j] += dp[r][c]
                }
            }
        }
    }
}
