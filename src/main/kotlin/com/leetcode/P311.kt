package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/311
class P311 {
    private val dy = intArrayOf(-1, +0, +1, +0)
    private val dx = intArrayOf(+0, +1, +0, -1)
    fun shortestPath(grid: Array<IntArray>, k: Int): Int {
        val m = grid.size
        val n = grid[0].size
        val memo = Array(m) { Array(n) { intArrayOf(m * n, m * n) } }
        // [y좌표, x좌표, 장애물제거수]
        val queue = LinkedList<IntArray>()
        queue += intArrayOf(0, 0, 0)

        var move = 0 // 이동 수

        loop@ while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val (y, x, eliminate) = queue.poll()
                // 목적지 도착
                if (y == m - 1 && x == n - 1) { // 도착
                    return move
                }
                // 네방향 체크
                dy.zip(dx) { a, b ->
                    val ny = y + a
                    val nx = x + b

                    if (ny in 0 until m && nx in 0 until n) {
                        val next = intArrayOf(ny, nx, eliminate)
                        if (grid[ny][nx] == 1) { // 벽
                            if (eliminate < k) { // 장애물 제거 가능
                                next[2]++
                            } else { // 장애물 제거 불가능
                                return@zip
                            }
                        }
                        memo[ny][nx][0] = move
                        memo[ny][nx][1] = next[2]
                        queue += next
                    }
                }
            }
            move++
        }
        return -1
    }

}
