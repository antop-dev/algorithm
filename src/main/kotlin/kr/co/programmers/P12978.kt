package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/411
class P12978 {
    companion object {
        const val INF = 500_001 // 최대 시간은 K + 1
    }

    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        if (N == 1) return 1
        // 행노드 -> 열노드간의 거리를 2차원 배열에 담는다.
        val graph = graph(N, road)
        // 노드 방문 여부
        val visited = BooleanArray(N + 1)
        // 이동 시간
        val times = IntArray(N + 1) { i -> if (i != 1) INF else 0 }
        // 우선순위 큐
        val pq = PriorityQueue<Int>() { o1, o2 -> times[o1] - times[o2] }
        pq += 1

        while (pq.isNotEmpty()) {
            val node = pq.poll()
            if (visited[node]) continue
            visited[node] = true

            for (nextNode in 1..N) {
                val nextTime = graph[node][nextNode]
                if (times[node] + nextTime < times[nextNode]) {
                    times[nextNode] = times[node] + nextTime // 시간 갱신
                    pq += nextNode
                }
            }
        }
        // K 시간 이하로 배달이 가능한 노드 개수 세기
        return times.count { it <= k }
    }

    private fun graph(N: Int, road: Array<IntArray>): Array<IntArray> {
        val graph = Array(N + 1) { i ->
            IntArray(N + 1) { j ->
                if (i != j) INF else 0
            }
        }
        // 두 마을 a, b를 연결하는 도로는 여러 개가 있을 수 있습니다.
        for ((a, b, c) in road) {
            graph[a][b] = minOf(graph[a][b], c)
            graph[b][a] = minOf(graph[b][a], c)
        }
        return graph
    }

}
