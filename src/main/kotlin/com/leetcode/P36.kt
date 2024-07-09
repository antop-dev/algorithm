package com.leetcode

// https://github.com/antop-dev/algorithm/issues/318
class P36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val n = 9
        val rows = Array(n) { BooleanArray(n) }
        val cols = Array(n) { BooleanArray(n) }
        val boxes = Array(n) { BooleanArray(n) }

        for (row in 0 until n) {
            for (col in 0 until n) {
                if (board[row][col] == '.') continue
                // '1' -> 0
                // '2' -> 1
                val num = board[row][col] - '1'
                // 가로열 중 num이 있는가?
                if (rows[row][num]) return false
                // 세로열 중 num이 있는가?
                if (cols[col][num]) return false
                // 3x3 중 num이 있는가?
                val box = (row / 3 * 3) + (col / 3)
                if (boxes[box][num]) return false
                // 마킹
                cols[col][num] = true
                rows[row][num] = true
                boxes[box][num] = true
            }
        }

        return true
    }

}
