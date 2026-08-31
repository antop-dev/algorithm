package com.leetcode

// https://github.com/antop-dev/algorithm/issues/781
class P419 {
    fun countBattleships(board: Array<CharArray>): Int {
        var ans = 0
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 'X' &&
                    (i == 0 || board[i - 1][j] != 'X') &&
                    (j == 0 || board[i][j - 1] != 'X')
                ) {
                    ans++
                }
            }
        }
        return ans
    }
}
