package com.leetcode

// https://github.com/antop-dev/algorithm/issues/700
class P1605 {
    fun restoreMatrix(rowSum: IntArray, colSum: IntArray): Array<IntArray> {
        val n = rowSum.size
        val m = colSum.size
        val matrix = Array(n) { IntArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                val v = minOf(rowSum[i], colSum[j])
                matrix[i][j] = v
                rowSum[i] -= v
                colSum[j] -= v
            }
        }
        return matrix
    }
}