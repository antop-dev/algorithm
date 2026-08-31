package com.leetcode

// https://github.com/antop-dev/algorithm/issues/782
class P1765 {
    val dy = intArrayOf(-1, 0, 1, 0)
    val dx = intArrayOf(0, 1, 0, -1)

    fun highestPeak(isWater: Array<IntArray>): Array<IntArray> {
        val m = isWater.size
        val n = isWater[0].size
        val ans = Array(m) { IntArray(n) { -1 } } // 계산되지 않은 지역은 -1

        val queue = ArrayDeque<IntArray>() // [y, x, height]
        for (y in 0 until m) {
            for (x in 0 until n) {
                if (isWater[y][x] == 1) {
                    ans[y][x] = 0
                    queue += intArrayOf(y, x, 0)
                }
            }
        }
        // BFS
        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val (y, x, height) = queue.removeFirst()
                dy.zip(dx) { ny, nx ->
                    val nextY = y + ny
                    val nextX = x + nx
                    if (nextY in 0 until m && nextX in 0 until n && ans[nextY][nextX] == -1) {
                        ans[nextY][nextX] = height + 1
                        queue += intArrayOf(nextY, nextX, height + 1)
                    }
                }
            }
        }
        return ans
    }
}
