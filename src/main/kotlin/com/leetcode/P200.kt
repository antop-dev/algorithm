package com.leetcode

// https://github.com/antop-dev/algorithm/issues/287
class P200 {
    fun numIslands(grid: Array<CharArray>): Int {
        var answer = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j)
                    answer++
                }
            }
        }
        return answer
    }

    private fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
        if (i !in 0..grid.lastIndex) return
        if (j !in 0..grid[i].lastIndex) return
        if (grid[i][j] == '0') return
        grid[i][j] = '0'
        dfs(grid, i - 1, j)
        dfs(grid, i + 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i, j + 1)
    }
}
