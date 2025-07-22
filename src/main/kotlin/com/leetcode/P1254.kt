package com.leetcode

// https://github.com/antop-dev/algorithm/issues/670
class P1254 {
    fun closedIsland(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[n - 1].size
        // 가장자리에 있는 섬을 모두 바다로 변경
        for (i in 0 until n) {
            if (grid[i][0] == 0) {
                dfs(grid, i, 0)
            }
            if (grid[i][m - 1] == 0) {
                dfs(grid, i, m - 1)
            }
        }
        for (j in 0 until m) {
            if (grid[0][j] == 0) {
                dfs(grid, 0, j)
            }
            if (grid[n - 1][j] == 0) {
                dfs(grid, n - 1, j)
            }
        }
        // 남은 섬의 수를 센다.
        var ans = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j)
                    ans++
                }
            }
        }
        return ans
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int) {
        if (i !in grid.indices || j !in grid[i].indices || grid[i][j] != 0) {
            return
        }
        grid[i][j] = 1
        dfs(grid, i - 1, j) // ↑
        dfs(grid, i, j + 1) // →
        dfs(grid, i + 1, j) // ↓
        dfs(grid, i, j - 1) // ←
    }
}