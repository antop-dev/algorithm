package com.leetcode

// https://github.com/antop-dev/algorithm/issues/538
class P289 {
    companion object {
        const val LIVE = 1
        const val DEAD_TO_LIVE = 3
        const val DEAD = 0
        const val LIVE_TO_DEAD = 2
    }

    fun gameOfLife(board: Array<IntArray>) {
        for (i in board.indices) {
            for (j in board[i].indices) {
                val count = countMooreNeighborhood(board, i, j)
                val v = board[i][j]
                board[i][j] = when {
                    count < 2 && v == LIVE -> LIVE_TO_DEAD
                    count == 3 && v == DEAD -> DEAD_TO_LIVE
                    count > 3 && v == LIVE -> LIVE_TO_DEAD
                    else -> v
                }
            }
        }

        for (i in board.indices) {
            for (j in board[i].indices) {
                board[i][j] %= 2
            }
        }
    }

    private val dy = intArrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
    private val dx = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)

    // 주위 8방향의 살아있는 세포 수를 센다.
    private fun countMooreNeighborhood(board: Array<IntArray>, i: Int, j: Int): Int {
        var count = 0
        dy.zip(dx) { ny, nx ->
            val y = i + ny
            val x = j + nx
            if (y in 0..board.lastIndex
                && x in 0..board[y].lastIndex
                && (board[y][x] == LIVE || board[y][x] == LIVE_TO_DEAD)
            ) {
                count++
            }
        }
        return count
    }

}
