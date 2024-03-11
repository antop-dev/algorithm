package com.leetcode

import java.util.*
import kotlin.math.abs
import kotlin.math.max

// https://github.com/antop-dev/algorithm/issues/544
class P1631 {

    fun minimumEffortPath(heights: Array<IntArray>): Int {
        val n = heights.size
        val m = heights[n - 1].size

        val dist = Array(n) { IntArray(m) { Int.MAX_VALUE } }
        dist[0][0] = 0
        // [y, x, effort]
        val pq = PriorityQueue<IntArray> { a, b -> a[2] - b[2] }
        pq += intArrayOf(0, 0, 0)

        val dir = arrayOf(-1 to 0, 0 to 1, 1 to 0, 0 to -1)
        while (pq.isNotEmpty()) {
            val (y, x, effort) = pq.poll()
            for ((dy, dx) in dir) {
                val ny = y + dy
                val nx = x + dx
                if (ny !in 0 until n || nx !in 0 until m) continue
                val newEffort = max(effort, abs(heights[y][x] - heights[ny][nx]))
                if (newEffort < dist[ny][nx]) {
                    dist[ny][nx] = newEffort
                    pq += intArrayOf(ny, nx, newEffort)
                }
            }
        }
        return dist[n - 1][m - 1]
    }
}
