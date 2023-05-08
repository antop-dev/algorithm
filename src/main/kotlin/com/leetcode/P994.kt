package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/487
class P994 {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        val fresh = intArrayOf(0) // 함수에 값을 넘기기위해 참조로 씀
        for (y in grid.indices) {
            for (x in grid[y].indices) {
                when (grid[y][x]) {
                    1 -> fresh[0]++ // fresh 카운팅
                    2 -> queue += y to x // rotten 위치 큐에 저장
                }
            }
        }

        if (fresh[0] == 0) return 0

        var minutes = -1
        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val (y, x) = queue.poll()
                go(queue, grid, fresh, y - 1, x) // 북
                go(queue, grid, fresh, y, x + 1) // 동
                go(queue, grid, fresh, y + 1, x) // 남
                go(queue, grid, fresh, y, x - 1) // 서
            }
            minutes++
        }

        return if (fresh[0] == 0) minutes else -1
    }

    private fun go(queue: LinkedList<Pair<Int, Int>>, grid: Array<IntArray>, fresh: IntArray, y: Int, x: Int) {
        if (y >= 0 && y < grid.size && x >= 0 && x < grid[y].size && grid[y][x] == 1) {
            queue += y to x
            grid[y][x] = 2
            fresh[0]--
        }
    }

}
