package com.leetcode

// https://github.com/antop-dev/algorithm/issues/681
class P1905 {
    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        var ans = 0
        for (i in grid2.indices) {
            for (j in grid2[i].indices) {
                val count = dfs(grid1, grid2, i, j)
                if (count > 0 && count / 10_000 == count % 10_000) {
                    ans++
                }
            }
        }
        return ans
    }

    private fun dfs(grid1: Array<IntArray>, grid2: Array<IntArray>, i: Int, j: Int): Int {
        if (i !in grid2.indices || j !in grid2[i].indices || grid2[i][j] == 0) {
            return 0
        }
        grid2[i][j] = 0 // 방문 체크

        var count = (grid1[i][j] * 10_000) + 1
        count += dfs(grid1, grid2, i - 1, j)
        count += dfs(grid1, grid2, i, j + 1)
        count += dfs(grid1, grid2, i + 1, j)
        count += dfs(grid1, grid2, i, j - 1)
        return count
    }
}