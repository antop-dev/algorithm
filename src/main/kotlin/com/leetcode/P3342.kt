package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/609
class P3342 {
    private val dirs = arrayOf(
        -1 to 0,
        0 to 1,
        1 to 0,
        0 to -1
    )

    fun minTimeToReach(moveTime: Array<IntArray>): Int {
        val n = moveTime.size
        val m = moveTime[n - 1].size

        val memo = Array(n) { IntArray(m) { Int.MAX_VALUE } }
        memo[0][0] = 0

        val pq = PriorityQueue<Node> { o1, o2 -> o1.time - o2.time }
        pq += Node(0, 0, 0, 0)

        while (pq.isNotEmpty()) {
            val node = pq.poll()

            if (node.y == n - 1 && node.x == m - 1) {
                return node.time
            }

            for ((y, x) in dirs) {
                val ny = node.y + y
                val nx = node.x + x
                if (ny in 0 until n && nx in 0 until m) {
                    val stepTime = if ((node.step + 1) % 2 == 0) 2 else 1
                    val waitTime = maxOf(moveTime[ny][nx] - node.time, 0)
                    val newTime = node.time + stepTime + waitTime
                    if (newTime < memo[ny][nx]) {
                        memo[ny][nx] = newTime
                        pq += Node(ny, nx, node.step + 1, newTime)
                    }
                }
            }
        }

        return -1 // unreachable
    }

    data class Node(val y: Int, val x: Int, val step: Int, val time: Int)
}
