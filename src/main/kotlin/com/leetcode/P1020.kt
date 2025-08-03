package com.leetcode

// https://github.com/antop-dev/algorithm/issues/675
class P1020 {
    fun numEnclaves(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[n - 1].size
        val visited = Array(n) { BooleanArray(m) }
        // 가장자리부터 시작된 육지를 모두 바다로 변경한다
        for (j in 0 until m) {
            dfs(grid, 0, j, visited)
            dfs(grid, n - 1, j, visited)
        }
        for (i in 1 until n - 1) {
            dfs(grid, i, 0, visited)
            dfs(grid, i, m - 1, visited)
        }
        // 육지를 센다
        return grid.sumOf { row -> row.count { it == 1 } }
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int, visited: Array<BooleanArray>) {
        if (i !in grid.indices || j !in grid[i].indices || visited[i][j] || grid[i][j] == 0) {
            return
        }
        visited[i][j] = true // 방문 표시
        grid[i][j] = 0 // 바다로 변경
        dfs(grid, i - 1, j, visited) // 위
        dfs(grid, i, j + 1, visited) // 오른쪽
        dfs(grid, i + 1, j, visited) // 아래
        dfs(grid, i, j - 1, visited) // 왼쪽
    }
}