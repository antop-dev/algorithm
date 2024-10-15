package com.leetcode

// https://github.com/antop-dev/algorithm/issues/591
class P3239 {
    fun minFlips(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size

        var row = 0
        var col = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (i < n / 2 && grid[i][j] != grid[n - 1 - i][j]) {
                    row++
                }
                if (j < m / 2 && grid[i][j] != grid[i][m - 1 - j]) {
                    col++
                }
            }
        }

        return minOf(col, row)
    }
}
