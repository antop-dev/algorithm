package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/566
class P92343 {
    companion object {
        private const val SHEEP = 0
    }

    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        val graph = graph(edges)
        val visited = mutableSetOf<Int>()
        val queue = LinkedList<IntArray>()
        queue += intArrayOf(0, 0b00000000000000001, 0, 0) // [노드 번호, 경로, 양, 늑대]

        var ans = 0
        while (queue.isNotEmpty()) {
            var (n, status, sheep, wolf) = queue.poll()
            if (!visited.add(status)) continue
            if (info[n] == SHEEP) sheep++ else wolf++
            if (sheep <= wolf) continue
            if (sheep > ans) ans = sheep

            val nodes = nextNodes(status, graph)
            for (to in nodes) {
                val bit = status or (1 shl to)
                queue += intArrayOf(to, bit, sheep, wolf)
            }
        }
        return ans
    }

    // 2차원 배열에서 Map<시작 노드, List<도착 노드>>으로 변환
    private fun graph(edges: Array<IntArray>) = edges.groupBy({ it[0] }, { it[1] })

    // 현재 상태에서 이동할 수 있는 노드들을 찾는다.
    private fun nextNodes(status: Int, graph: Map<Int, List<Int>>) = mutableListOf<Int>().apply {
        var bit = status
        var i = 0
        while (bit > 0) {
            if (bit and 0b1 == 0b1) {
                graph[i]?.forEach { to -> this += to }
            }
            bit = bit shr 1
            i++
        }
    }

}
