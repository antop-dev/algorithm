package com.leetcode

// https://github.com/antop-dev/algorithm/issues/671
class P529 {
    private val directions = intArrayOf(-1, 0, 1)

    fun updateBoard(board: Array<CharArray>, click: IntArray): Array<CharArray> {
        val (r, c) = click
        when {
            board[r][c] == 'M' -> board[r][c] = 'X'
            else -> dfs(board, r, c)
        }
        return board
    }

    private fun dfs(board: Array<CharArray>, r: Int, c: Int) {
        // 범위를 벗어나거나 이미 방문한 칸일 경우
        if (r !in board.indices || c !in board[r].indices || board[r][c] != 'E') {
            return
        }
        // 주위 지뢰 개수 세기
        val mines = countMines(board, r, c)
        if (mines > 0) { // 주위에 지뢰가 있는 경우
            board[r][c] = '0' + mines
        } else {
            board[r][c] = 'B'
            for (y in directions) {
                for (x in directions) {
                    if (y == 0 && x == 0) { // 자기 자신은 제외
                        continue
                    }
                    dfs(board, r + y, c + x)
                }
            }
        }
    }

    // 8방향의 지뢰 개수 리턴
    private fun countMines(board: Array<CharArray>, r: Int, c: Int): Int {
        var count = 0
        for (y in directions) {
            for (x in directions) {
                if (y == 0 && x == 0) { // 자기 자신은 제외
                    continue
                }
                val nr = r + y
                val nc = c + x
                if (nr in board.indices && nc in board[nr].indices && board[nr][nc] == 'M') {
                    count++
                }
            }
        }
        return count
    }
}