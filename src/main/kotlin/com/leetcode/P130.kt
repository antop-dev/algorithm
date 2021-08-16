package com.leetcode

// https://github.com/antop-dev/algorithm/issues/313
class P130 {
    fun solve(board: Array<CharArray>) {
        val m = board.size
        val n = board[0].size
        // [0] : 방문 여부
        // [1] : 'O' 여부
        val visited = Array(m) { Array(n) { IntArray(2) } }

        for (j in 0 until n) {
            dfs(board, visited, 0, j)
            dfs(board, visited, m - 1, j)
        }

        for (i in 1 until m - 1) {
            dfs(board, visited, i, 0)
            dfs(board, visited, i, n - 1)
        }

        // 방문되지 않은 곳을 전부 'X'로 변경
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (visited[i][j][0] == 0) {
                    board[i][j] = 'X'
                }
            }
        }
    }

    private fun dfs(board: Array<CharArray>, visited: Array<Array<IntArray>>, i: Int, j: Int) {
        if (i !in 0..board.lastIndex) return
        if (j !in 0..board[0].lastIndex) return

        val here = visited[i][j]
        if (here[0] == 1) return

        here[0] = 1 // visited
        if (board[i][j] == 'X') return

        here[1] = 1 // 'O'
        dfs(board, visited, i - 1, j) // ↑
        dfs(board, visited, i + 1, j) // ↓
        dfs(board, visited, i, j - 1) // ←
        dfs(board, visited, i, j + 1) // →
    }

}
