package com.leetcode

// https://leetcode.com/problems/minimum-path-sum/description/
class P64 {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        for (i in 1 until n) grid[0][i] += grid[0][i - 1]
        for (i in 1 until m) grid[i][0] += grid[i - 1][0]
        for (i in 1 until m) {
            for (j in 1 until n) {
                grid[i][j] += minOf(grid[i - 1][j], grid[i][j - 1])
            }
        }

        return grid[m - 1][n - 1]
    }
}
