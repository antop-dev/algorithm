package com.leetcode

// https://github.com/antop-dev/algorithm/issues/318
class P36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val n = 9
        val rows = Array(9) { IntArray(9) }
        val cols = Array(9) { IntArray(9) }
        val boxes = Array(9) { IntArray(9) }

        for (r in 0 until n) {
            for (c in 0 until n) {
                if (board[r][c] == '.') continue

                val j = board[r][c] - '1'

                if (rows[r][j] == 1) return false
                rows[r][j] = 1

                if (cols[c][j] == 1) return false
                cols[c][j] = 1

                val i = ((r / 3) * 3) + (c / 3)
                if (boxes[i][j] == 1) return false
                boxes[i][j] = 1
            }
        }

        return true
    }

}
