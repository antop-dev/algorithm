package com.leetcode

// https://github.com/antop-dev/algorithm/issues/731
class P1267 {
    fun countServers(grid: Array<IntArray>): Int {
        // 행열의 컴퓨터 수 카운팅
        val rows = IntArray(grid.size)
        val cols = IntArray(grid[0].size)
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                rows[i] += grid[i][j]
                cols[j] += grid[i][j]
            }
        }

        println("    ${cols.joinToString()}")
        println("--+-" + "-".repeat(cols.size * 3))
        for(i in grid.indices) {
            println("${rows[i]} | ${grid[i].joinToString()}")
        }

        // 탐색
        var count = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                // 나와 같은 행렬에 다른 컴퓨터가 있으면 나는 연결된 컴퓨터다
                if (grid[i][j] == 1 && (rows[i] >= 2 || cols[j] >= 2)) {
                    count++
                }
            }
        }
        return count
    }
}



