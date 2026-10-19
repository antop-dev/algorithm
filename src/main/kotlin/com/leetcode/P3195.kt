package com.leetcode

// https://github.com/antop-dev/algorithm/issues/794
class P3195 {
    fun minimumArea(grid: Array<IntArray>): Int {
        var minRow = 1000
        var maxRow = 0
        var minCol = 1000
        var maxCol = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    minRow = minOf(minRow, i)
                    maxRow = maxOf(maxRow, i)
                    minCol = minOf(minCol, j)
                    maxCol = maxOf(maxCol, j)
                }
            }
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1)
    }
}
