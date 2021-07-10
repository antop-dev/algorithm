package com.leetcode

// https://github.com/antop-dev/algorithm/issues/99
class P64 {
    fun minPathSum(grid: Array<IntArray>): Int {
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                grid[i][j] += when {
                    (i <= 0 && j <= 0) -> 0
                    (i <= 0) -> grid[i][j - 1]
                    (j <= 0) -> grid[i - 1][j]
                    else -> minOf(grid[i - 1][j], grid[i][j - 1])
                }
            }
        }
        return grid.last().last()
    }
}
