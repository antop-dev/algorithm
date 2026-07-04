package com.leetcode

// https://github.com/antop-dev/algorithm/issues/760
class P3537 {
    fun specialGrid(n: Int): Array<IntArray> {
        val size = 1 shl n // 2^n
        val grid = Array(size) { IntArray(size) }
        fill(grid, n, 0, 0, size * size - 1)
        return grid
    }

    private fun fill(grid: Array<IntArray>, n: Int, i: Int, j: Int, currNum: Int): Int {
        return if (n == 0) {
            grid[i][j] = currNum
            currNum - 1
        } else {
            val half = (1 shl n) / 2
            var x = currNum
            x = fill(grid, n - 1, i, j, x)
            x = fill(grid, n - 1, i + half, j, x)
            x = fill(grid, n - 1, i + half, j + half, x)
            x = fill(grid, n - 1, i, j + half, x)
            x
        }
    }
}
