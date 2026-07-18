package com.leetcode

// https://github.com/antop-dev/algorithm/issues/766
class P2101 {
    fun maximumDetonation(bombs: Array<IntArray>): Int {
        // 그래프 만듦
        val graph = graph(bombs)
        // 각 노드에서 방문하는 노드 수 카운트 중 가장 큰 수 찾기
        var ans = 0
        for (i in bombs.indices) {
            val count = count(graph, i)
            ans = maxOf(ans, count)
        }
        return ans
    }

    // 폭발 범위로 그래프를 생성
    private fun graph(bombs: Array<IntArray>): Array<List<Int>> {
        val graph = Array<List<Int>>(bombs.size) { emptyList() }
        for (i in bombs.indices) {
            val tos = mutableListOf<Int>()
            val (x1, y1, r) = bombs[i]
            for (j in bombs.indices) {
                if (i == j) {
                    continue
                }
                val (x2, y2, _) = bombs[j]
                // 두 점 사이의 거리의 제곱을 계산 (유클리드 거리)
                val dist = (x1.toLong() - x2) * (x1.toLong() - x2) + (y1.toLong() - y2) * (y1.toLong() - y2)
                // 반지름 범위 안에 있으면 단방향 간선 추가
                if (dist <= r.toLong() * r) {
                    tos += j
                }
            }
            graph[i] = tos
        }
        return graph
    }

    // BFS
    private fun count(graph: Array<List<Int>>, start: Int): Int {
        val visited = mutableSetOf<Int>()

        val queue = ArrayDeque<Int>()
        queue += start
        visited += start

        while (queue.isNotEmpty()) {
            val from = queue.removeFirst()
            val tos = graph[from]
            for (to in tos) {
                if (to in visited) {
                    continue
                }
                queue += to
                visited += to
            }
        }
        return visited.size
    }
}
