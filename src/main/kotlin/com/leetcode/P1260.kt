package com.leetcode

// https://leetcode.com/problems/shift-2d-grid/
class P1260 {

    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val n = grid.size
        val m = grid[0].size
        val size = n * m
        val ans = MutableList(grid.size) { MutableList(grid[0].size) { 0 } }

        var y = (size - (k % size)) / m
        if (y >= n) y = 0
        var x = (size - (k % size)) % m

        var i = 0
        while (i < size) {
            ans[i / m][i % m] = grid[y][x]
            x++
            if (x >= m) {
                y++
                x = 0
            }
            if (y >= n) {
                y = 0
            }
            i++
        }

        return ans
    }

}
