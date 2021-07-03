package com.leetcode

// https://github.com/antop-dev/algorithm/issues/286
class P959 {
    fun regionsBySlashes(grid: Array<String>): Int {
        val n = grid.size

        val arr = Array(n * 3) { IntArray(n * 3) }
        for (i in 0 until (n * n)) {
            val p = intArrayOf(i / n * 3, i % n * 3)
            when (grid[i / n][i % n]) {
                '\\' -> {
                    arr[p[0]][p[1]] = 1
                    arr[p[0] + 1][p[1] + 1] = 1
                    arr[p[0] + 2][p[1] + 2] = 1
                }
                '/' -> {
                    arr[p[0]][p[1] + 2] = 1
                    arr[p[0] + 1][p[1] + 1] = 1
                    arr[p[0] + 2][p[1]] = 1
                }
            }
        }

        var answer = 0
        for (i in arr.indices) {
            for (j in arr[i].indices) {
                if (arr[i][j] == 0) {
                    dfs(arr, i, j)
                    answer++
                }
            }
        }
        return answer
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int) {
        if (i !in 0..grid.lastIndex) return
        if (j !in 0..grid[i].lastIndex) return
        if (grid[i][j] == 1) return
        grid[i][j] = 1
        dfs(grid, i - 1, j)
        dfs(grid, i + 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i, j + 1)
    }

}
