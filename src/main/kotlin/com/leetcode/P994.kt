package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/487
class P994 {
    fun orangesRotting(grid: Array<IntArray>): Int {
        var freshs = 0 // 신선한 오렌지 갯수
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        val m = grid.size
        val n = grid[m - 1].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                when (grid[i][j]) {
                    1 -> freshs++
                    2 -> queue += (i to j)
                }
            }
        }

        if (freshs == 0) { // 신선한 오렌지가 없는 경우
            return 0
        }

        // BFS
        val dx = intArrayOf(0, 1, 0, -1)
        val dy = intArrayOf(-1, 0, 1, 0)
        var minutes = -1
        while (queue.isNotEmpty()) {
            val count = queue.size
            repeat(count) {
                val (i, j) = queue.poll()
                dy.zip(dx) { x, y ->
                    val ni = i + y
                    val nj = j + x
                    if (ni in 0 until m &&
                        nj in 0 until n &&
                        grid[ni][nj] == 1
                    ) {
                        queue += ni to nj
                        grid[ni][nj] = 2
                        freshs--
                    }
                }
            }
            minutes++
        }
        return if (freshs == 0) minutes else -1
    }
}
