package com.leetcode

import java.util.LinkedList

// https://github.com/antop-dev/algorithm/issues/659
class P1334 {
    fun findTheCity(n: Int, edges: Array<IntArray>, distanceThreshold: Int): Int {
        var min = 10_001
        var ans = n
        val graph = graph(n, edges)
        for (city in (n - 1) downTo 0) {
            val count = bfs(graph, city, distanceThreshold)
            if (count < min) {
                ans = city
                min = count
            }
        }
        return ans
    }

    private fun bfs(graph: Array<IntArray>, start: Int, distanceThreshold: Int): Int {
        // 방문한 도시
        val visited = mutableSetOf<Int>()
        // 해당 도시까지 간 비용
        val weights = IntArray(graph.size) { Int.MAX_VALUE }
        weights[start] = 0
        // 다음으로 가야할 도시들
        val queue = LinkedList<Int>()
        queue += start
        // BFS
        while (queue.isNotEmpty()) {
            val from = queue.poll()
            visited += from
            for (to in 0 until graph.size) {
                if (graph[from][to] == 0) continue
                val nextWeight = weights[from] + graph[from][to]
                if (nextWeight < weights[to] && nextWeight <= distanceThreshold) {
                    queue += to
                    weights[to] = nextWeight
                }
            }
        }
        // 시작 지점을 제외한 방문한 도시 수 리턴
        return visited.size - 1
    }

    // from ↔︎ to 비용 그래프
    private fun graph(n: Int, edges: Array<IntArray>): Array<IntArray> {
        val graph = Array(n) { IntArray(n) }
        for ((from, to, weight) in edges) {
            graph[from][to] = weight
            graph[to][from] = weight
        }
        return graph
    }
}