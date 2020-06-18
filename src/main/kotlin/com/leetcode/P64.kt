package com.leetcode

// https://leetcode.com/problems/minimum-path-sum/description/
class P64 {
    fun minPathSum(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        for (i in 1 until cols) { // 첫번째 행
            grid[0][i] += grid[0][i - 1]
        }
        for (i in 1 until rows) { // 첫번째 열
            grid[i][0] += grid[i - 1][0]
        }
        for (i in 1 until rows) {
            for (j in 1 until cols) {
                grid[i][j] += minOf(grid[i - 1][j], grid[i][j - 1])
            }
        }
        return grid[rows - 1][cols - 1]
    }
}
