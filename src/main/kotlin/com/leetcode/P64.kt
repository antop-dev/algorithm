package com.leetcode

// https://github.com/antop-dev/algorithm/issues/99
class P64 {
    fun minPathSum(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        for (i in 0 until n) {
            for (j in 0 until m) {
                grid[i][j] += when {
                    (i == 0 && j == 0) -> 0 // 1행1열
                    (i == 0) -> grid[i][j - 1] // 1행
                    (j == 0) -> grid[i - 1][j] // 1열
                    else -> minOf(grid[i - 1][j], grid[i][j - 1])
                }
            }
        }
        return grid[n - 1][m - 1]
    }
}
