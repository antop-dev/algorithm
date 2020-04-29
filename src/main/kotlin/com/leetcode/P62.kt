package com.leetcode

// https://leetcode.com/problems/unique-paths/
class P62 {
    fun uniquePaths(m: Int, n: Int): Int {
        val grid = Array(n) { Array(m) { 1 } }
        for (i in 1 until n) {
            for (j in 1 until m) {
                grid[i][j] = grid[i][j - 1] + grid[i - 1][j]
            }
        }
        return grid[n - 1][m - 1]
    }
}