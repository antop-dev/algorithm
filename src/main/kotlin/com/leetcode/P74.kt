package com.leetcode

// https://github.com/antop-dev/algorithm/issues/47
class P74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size

        var l = 0
        var r = (m * n) - 1
        while (l <= r) {
            val mid = (l + r) / 2
            val y = mid / n
            val x = mid % n

            when {
                matrix[y][x] == target -> return true
                matrix[y][x] < target -> l = mid + 1
                else -> r = mid - 1
            }
        }

        return false
    }
}
