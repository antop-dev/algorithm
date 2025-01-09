package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/311
class P311 {
    val dy = intArrayOf(-1, 0, 1, 0)
    val dx = intArrayOf(0, 1, 0, -1)

    fun shortestPath(grid: Array<IntArray>, k: Int): Int {
        var ans = Int.MAX_VALUE
        val n = grid.size
        val m = grid[0].size
        // 각 위치의 최소 스탭 수 기록
        val memo = Array(n) { Array(m) { Int.MAX_VALUE } }
        memo[0][0] = 0
        // 우선순위 큐
        val pq = PriorityQueue<Cell>(compareBy({ it.eliminate }, { it.step }))
        pq += Cell(0, 0, 0, 0)

        while (pq.isNotEmpty()) {
            val curr = pq.poll()
            // 목적지 도착
            if (curr.y == n - 1 && curr.x == m - 1) {
                ans = minOf(ans, curr.step)
            }
            // 4방향 탐색
            for (i in dy.indices) {
                val ny = curr.y + dy[i]
                val nx = curr.x + dx[i]
                // 이동할 수 없는 조건들
                if (ny !in 0 until n || nx !in 0 until m) continue
                if (curr.step + 1 >= memo[ny][nx]) continue
                if (grid[ny][nx] == 1 && curr.eliminate >= k) continue
                // 이동 가능
                val next = Cell(
                    y = ny,
                    x = nx,
                    step = curr.step + 1,
                    eliminate = if (grid[ny][nx] == 1) curr.eliminate + 1 else curr.eliminate
                )
                memo[ny][nx] = next.step
                pq += next
            }
        }
        // 도착하지 못함
        if (ans == Int.MAX_VALUE) {
            ans = -1
        }
        return ans
    }

    data class Cell(
        val y: Int,
        val x: Int,
        val step: Int,
        val eliminate: Int
    )
}
