package com.leetcode

// https://github.com/antop-dev/algorithm/issues/467
class P980 {
    fun uniquePathsIII(grid: Array<IntArray>): Int {
        var y = 0
        var x = 0
        var total = 0 // 갈 수 있는 남은 칸 수
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val v = grid[i][j]
                if (v == 0) { // 이동 가능 칸
                    total++
                } else if (v == 1) { // 출발 칸
                    y = i
                    x = j
                    // 시작 지점을 갈 수 있는 블럭으로 처리
                    grid[y][x] = 0
                    total++
                }
            }
        }
        return dfs(grid, y, x, total)
    }

    private fun dfs(grid: Array<IntArray>, y: Int, x: Int, remain: Int): Int {
        if (y < 0 || y >= grid.size
            || x < 0 || x >= grid[y].size
            || grid[y][x] == -1 // 벽
        ) {
            return 0
        }
        // 도착
        if (grid[y][x] == 2) {
            // 남아있는 칸이 없어야 함
            return if (remain == 0) 1 else 0
        }
        grid[y][x] = -1 // visited
        val r = remain - 1
        val sum = dfs(grid, y - 1, x, r) + // 북
                dfs(grid, y, x + 1, r) + // 동
                dfs(grid, y + 1, x, r) + // 남
                dfs(grid, y, x - 1, r) // 서
        grid[y][x] = 0 // backtracking
        return sum
    }

}
