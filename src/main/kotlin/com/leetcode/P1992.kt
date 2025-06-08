package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/661
class P1992 {
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {
        val ans = mutableListOf<IntArray>()
        val m = land.size
        val n = land[0].size
        for (r1 in 0 until m) {
            for (c1 in 0 until n) {
                if (land[r1][c1] == 1) {
                    val (r2, c2) = bfs(land, r1, c1)
                    ans += intArrayOf(r1, c1, r2, c2)
                }
            }
        }
        return ans.toTypedArray()
    }

    private fun bfs(land: Array<IntArray>, r1: Int, c1: Int): Pair<Int, Int> {
        val m = land.size
        val n = land[0].size
        var node = r1 to c1

        val queue = LinkedList<Pair<Int, Int>>()
        queue += node

        while (queue.isNotEmpty()) {
            node = queue.poll()
            val (r, c) = node
            // ↓
            if (r + 1 < m && land[r + 1][c] == 1) {
                land[r + 1][c] = 0
                queue += (r + 1) to c
            }
            // →
            if (c + 1 < n && land[r][c + 1] == 1) {
                land[r][c + 1] = 0
                queue += r to (c + 1)
            }
        }
        return node
    }
}