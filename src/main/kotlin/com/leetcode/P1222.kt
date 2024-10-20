package com.leetcode

// https://github.com/antop-dev/algorithm/issues/593
class P1222 {
    fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
        val n = 8
        val chessboard = Array(n) { BooleanArray(n) }
        for ((y, x) in queens) {
            chessboard[y][x] = true
        }
        // ↑ ↗ → ↘ ↓ ↙ ← ︎↖
        val dy = intArrayOf(1, 1, 0, -1, -1, -1, 0, 1)
        val dx = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)
        val ans = mutableListOf<List<Int>>()
        dy.zip(dx) { ny, nx ->
            val queen = findNearestQueen(chessboard, king, ny, nx)
            if (queen != null) {
                ans += queen
            }
        }
        return ans
    }

    private fun findNearestQueen(chessboard: Array<BooleanArray>, king: IntArray, ny: Int, nx: Int): List<Int>? {
        var y = king[0] + ny
        var x = king[1] + nx
        while (y in 0 until 8 && x in 0 until 8) {
            if (chessboard[y][x]) {
                return listOf(y, x)
            }
            y += ny
            x += nx
        }
        return null
    }
}
