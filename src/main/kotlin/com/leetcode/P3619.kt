package com.leetcode

// https://github.com/antop-dev/algorithm/issues/677
class P3619 {
    fun countIslands(grid: Array<IntArray>, k: Int): Int {
        var ans = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val sum = dfs(grid, i, j)
                if (sum > 0 && sum % k == 0) {
                    ans++
                }
            }
        }
        return ans
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int): Int {
        if (i !in grid.indices || j !in grid[i].indices || grid[i][j] == 0) {
            return 0
        }

        var sum = grid[i][j]
        grid[i][j] = 0 // 방문한 곳은 0으로 변경

        sum += dfs(grid, i - 1, j) // ↑
        sum += dfs(grid, i, j + 1) // →
        sum += dfs(grid, i + 1, j) // ↓
        sum += dfs(grid, i, j - 1) // ←
        return sum
    }
}