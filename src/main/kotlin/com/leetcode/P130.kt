package com.leetcode

// https://github.com/antop-dev/algorithm/issues/313
class P130 {
    fun solve(board: Array<CharArray>) {
        val n = board.size
        val m = board[0].size
        // 첫행, 마지막행 탐색
        for (j in 0 until m) {
            dfs(board, 0, j)
            dfs(board, n - 1, j)
        }
        // 첫열, 마지막열 탐색
        for (i in 1 until n - 1) {
            dfs(board, i, 0)
            dfs(board, i, m - 1)
        }
        // 탐색했던 곳은 'O' 나머지는 전부 'X'로 변경
        for (i in 0 until n) {
            for (j in 0 until m) {
                board[i][j] = when (board[i][j]) {
                    'C' -> 'O'
                    else -> 'X'
                }
            }
        }
    }

    private fun dfs(board: Array<CharArray>, i: Int, j: Int) {
        if (i !in board.indices || j !in board[0].indices) {
            return
        }
        if (board[i][j] != 'O') {
            return
        }
        board[i][j] = 'C' // 체크됨
        // 4방향 DFS
        dfs(board, i - 1, j) // ↑
        dfs(board, i + 1, j) // ↓
        dfs(board, i, j - 1) // ←
        dfs(board, i, j + 1) // →
    }

}
