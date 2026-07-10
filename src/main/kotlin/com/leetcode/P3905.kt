package com.leetcode

import java.util.LinkedList

// https://github.com/antop-dev/algorithm/issues/762
class P3905 {
    val dy = intArrayOf(1, 0, -1, 0)
    val dx = intArrayOf(0, 1, 0, -1)

    fun colorGrid(n: Int, m: Int, sources: Array<IntArray>): Array<IntArray> {
        // 색 값이 큰 것부터 큐에 넣는다.
        val queue = LinkedList<IntArray>()
        sources.sortedByDescending { it[2] }.forEach { queue += it }
        // BFS 탐색
        val grid = Array(n) { IntArray(m) }
        while (queue.isNotEmpty()) {
            val (r, c, color) = queue.poll()
            if (grid[r][c] == 0) {
                grid[r][c] = color
                dy.zip(dx) { y, x ->
                    if (r + y in 0 until n && c + x in 0 until m && grid[r + y][c + x] == 0) {
                        queue += intArrayOf(r + y, c + x, color)
                    }
                }
            }
        }
        return grid
    }
}
