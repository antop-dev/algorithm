package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/637
class P417 {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val pacific = bfs(heights, pacificStartCells(heights))
        val atlantic = bfs(heights, atlanticStartCells(heights))

        val ans = mutableListOf<List<Int>>()
        for (i in heights.indices) {
            for (j in heights[i].indices) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans += listOf(i, j)
                }
            }
        }
        return ans
    }

    // 태평양 가장자리부터 시작
    private fun pacificStartCells(heights: Array<IntArray>) = mutableListOf<IntArray>().apply {
        for (j in heights[0].indices) this += intArrayOf(0, j)
        for (i in 1 until heights.size) this += intArrayOf(i, 0)
    }

    // 대서양 가장자리부터 시작
    private fun atlanticStartCells(heights: Array<IntArray>) = mutableListOf<IntArray>().apply {
        for (j in heights[0].indices) this += intArrayOf(heights.lastIndex, j)
        for (i in 0 until heights.lastIndex) this += intArrayOf(i, heights[0].lastIndex)
    }

    val dy = intArrayOf(-1, 0, 1, 0)
    val dx = intArrayOf(0, 1, 0, -1)

    private fun bfs(
        heights: Array<IntArray>,
        startCells: List<IntArray>
    ): Array<BooleanArray> {
        val n = heights.size
        val m = heights[0].size
        val memo = Array(n) { BooleanArray(m) }

        val queue = LinkedList<IntArray>()
        for ((y, x) in startCells) {
            queue += intArrayOf(y, x)
            memo[y][x] = true
        }

        while (queue.isNotEmpty()) {
            val (y, x) = queue.poll()
            for (i in dy.indices) {
                val nextY = y + dy[i]
                val nextX = x + dx[i]
                if (nextY in 0 until n && nextX in 0 until m &&
                    !memo[nextY][nextX] && heights[y][x] <= heights[nextY][nextX]
                ) {
                    memo[nextY][nextX] = true
                    queue += intArrayOf(nextY, nextX)
                }
            }
        }
        return memo
    }

}
