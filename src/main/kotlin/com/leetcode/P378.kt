package com.leetcode

// https://github.com/antop-dev/algorithm/issues/291
class P378 {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val n: Int = matrix.size
        var lo = matrix[0][0]
        var hi = matrix[n - 1][n - 1]
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            val count = xth(matrix, mid)
            if (count < k) lo = mid + 1 else hi = mid - 1
        }
        return lo
    }

    private fun xth(matrix: Array<IntArray>, v: Int): Int {
        var res = 0
        val n = matrix.size
        var i = n - 1
        var j = 0
        while (i >= 0 && j < n) {
            if (matrix[i][j] > v) {
                i--
            } else {
                res += i + 1
                j++
            }
        }
        return res
    }

}
