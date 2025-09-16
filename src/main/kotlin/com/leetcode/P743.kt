package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/685
class P743 {
    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        // 그래프 생성
        val graph = times.groupBy { (from, _, _) -> from }
        // 각 노드로 가는 최소 시간
        val minTime = IntArray(n + 1) { Int.MAX_VALUE }
        minTime[k] = 0
        // 우선순위 큐
        val pq = PriorityQueue<Int> { a, b -> minTime[a] - minTime[b] }
        pq += k
        // 노드 방문 체크
        val visited = mutableSetOf<Int>()
        // BFS 탐색
        var ans = 0
        while (pq.isNotEmpty()) {
            val from = pq.poll()
            // 방문 기록
            visited += from
            // 갈 수 있는 곳 탐색
            val tos = graph[from]?.filter { (_, to, time) ->
                minTime[from] + time < minTime[to]
            } ?: listOf()
            if (tos.isEmpty()) {
                ans = maxOf(ans, minTime[from])
            } else {
                for ((_, to, time) in tos) {
                    minTime[to] = minTime[from] + time // 최소 시간 갱신
                    pq += to
                }
            }
        }
        // 모두 방문 했다면 시간 리턴 아니면 -1
        return if (visited.size == n) ans else -1
    }
}