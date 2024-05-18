package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/559
class P547 {

    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        val visited = mutableSetOf<Int>()
        var ans = 0
        for (city in 0 until n) {
            if (city in visited) continue
            bfs(isConnected, visited, city)
            ans++
        }
        return ans
    }

    private fun bfs(connected: Array<IntArray>, visited: MutableSet<Int>, city: Int) {
        val queue = LinkedList<Int>()
        queue += city

        while (queue.isNotEmpty()) {
            val c = queue.poll()
            for (i in connected[c].indices) {
                if (i in visited) continue
                if (connected[c][i] == 1) {
                    queue += i
                    visited += i
                }
            }
        }
    }

}
