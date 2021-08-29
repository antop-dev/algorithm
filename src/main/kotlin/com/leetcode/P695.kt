package com.leetcode

// https://github.com/antop-dev/algorithm/issues/322
class P695 {
    private val dy = intArrayOf(1, -1, 0, 0)
    private val dx = intArrayOf(0, 0, -1, 1)

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var maxArea = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val area = dfs(grid, i, j)
                if (area > maxArea) maxArea = area
            }
        }

        return maxArea
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int): Int {
        if (i !in grid.indices) return 0
        if (j !in grid[i].indices) return 0
        if (grid[i][j] == 0) return 0

        grid[i][j] = 0 // 방문한 섬으로 변경

        var area = 1
        repeat(4) { k ->
            area += dfs(grid, i + dy[k], j + dx[k])
        }
        return area
    }
}
