package com.leetcode

import java.util.*
import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/544
class P1631 {
    fun minimumEffortPath(heights: Array<IntArray>): Int {
        val n = heights.size
        val m = heights[n - 1].size
        val minEffect = Array(n) { IntArray(m) { Int.MAX_VALUE } }
        minEffect[0][0] = 0
        // [y, x]
        val queue = LinkedList<IntArray>()
        queue += intArrayOf(0, 0)
        // 4방향
        val dir = arrayOf(-1 to 0, 0 to 1, 1 to 0, 0 to -1)
        while (queue.isNotEmpty()) {
            val (y, x) = queue.poll()
            for ((dy, dx) in dir) {
                val ny = y + dy
                val nx = x + dx
                if (ny !in 0 until n || nx !in 0 until m) {
                    continue
                }
                // 지금까지 왔던 비용과 다음 칸으로 갈 비용 중 더 큰 값을 선택
                val newEffect = maxOf(minEffect[y][x], abs(heights[y][x] - heights[ny][nx]))
                // 이미 기록되어 있는 곳보다 비용이 덜 들면 갱신
                if (newEffect < minEffect[ny][nx]) {
                    minEffect[ny][nx] = newEffect
                    queue += intArrayOf(ny, nx)
                }
            }
        }
        return minEffect[n - 1][m - 1]
    }
}
