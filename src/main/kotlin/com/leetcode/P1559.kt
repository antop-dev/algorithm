package com.leetcode

// https://github.com/antop-dev/algorithm/issues/688
class P1559 {
    fun containsCycle(grid: Array<CharArray>): Boolean {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        for (y in grid.indices) {
            for (x in grid[y].indices) {
                if (visited[y][x]) {
                    continue
                }
                if (dfs(grid, visited, intArrayOf(-1, -1), intArrayOf(y, x))) {
                    return true
                }
            }
        }
        return false
    }

    // → ↓ ← ↑
    val dy = intArrayOf(0, 1, 0, -1)
    val dx = intArrayOf(1, 0, -1, 0)

    private fun dfs(
        grid: Array<CharArray>,
        visited: Array<BooleanArray>,
        prev: IntArray,
        curr: IntArray,
    ): Boolean {
        val (y, x) = curr
        visited[y][x] = true

        for (i in dy.indices) {
            val ny = y + dy[i]
            val nx = x + dx[i]
            // 바로 전 노드로 가려는 경우
            if (prev[0] == ny && prev[1] == nx) {
                continue
            }
            // 좌표를 벗어난 경우
            if (ny !in 0 until grid.size || nx !in 0 until grid[y].size) {
                continue
            }
            // 다음 위치의 문자가 다른 경우
            if (grid[y][x] != grid[ny][nx]) {
                continue
            }
            // 이미 방문했다는 것은 순환된다는 것
            // DFS
            if (visited[ny][nx] || dfs(grid, visited, intArrayOf(y, x), intArrayOf(ny, nx))) {
                return true
            }
        }
        return false
    }
}