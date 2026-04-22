package com.leetcode

// https://github.com/antop-dev/algorithm/issues/740
class P1727 {
    fun largestSubmatrix(matrix: Array<IntArray>): Int {
        // 연속된 1의 개 카운팅
        val n = matrix.size
        val m = matrix[0].size
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (i > 0 && matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j]
                }
            }
        }
        // 연속된 1의 개수 * 거리가 가장 큰걸 찾는다.
        var ans = 0
        for (i in 0 until n) {
            matrix[i].sortDescending()
            for (j in 0 until m) {
                ans = maxOf(ans, matrix[i][j] * (j + 1))
            }
        }

        return ans
    }
}
