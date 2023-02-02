package com.leetcode

// https://github.com/antop-dev/algorithm/issues/459
class P37 {
    fun solveSudoku(board: Array<CharArray>) {
        solve(board, 0)
    }

    private fun solve(board: Array<CharArray>, pos: Int): Boolean {
        if (pos == 81) {
            return true
        }
        val y = pos / 9
        val x = pos % 9

        val set = possible(board, y, x)
        if (set.isEmpty()) {
            return false
        }

        val before = board[y][x]
        for (ch in set) {
            board[y][x] = ch
            val bool = solve(board, pos + 1)
            if (bool) return true
        }

        board[y][x] = before // backtracking
        return false
    }

    private fun possible(board: Array<CharArray>, y: Int, x: Int): Set<Char> {
        if (board[y][x] != '.') {
            return setOf(board[y][x])
        }

        val set = mutableSetOf('1', '2', '3', '4', '5', '6', '7', '8', '9')
        // 나와 같은 행의 수 제거
        for (i in 0 until 9) {
            val ch = board[i][x]
            if (ch != '0') {
                set -= ch
            }
        }
        // 나와 같은 열의 수 제거
        for (i in 0 until 9) {
            val ch = board[y][i]
            if (ch != '.') {
                set -= ch
            }
        }
        // 나와 같은 칸의 수 제거
        val startY = (y / 3) * 3
        val startX = (x / 3) * 3
        for (i in startY until startY + 3) {
            for (j in startX until startX + 3) {
                val ch = board[i][j]
                if (ch != '.') {
                    set -= ch
                }
            }
        }
        return set
    }

}
