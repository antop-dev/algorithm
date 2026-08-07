package com.leetcode

// https://github.com/antop-dev/algorithm/issues/772
class P3593 {
    fun minIncrease(n: Int, edges: Array<IntArray>, cost: IntArray): Int {
        val graph = graph(n, edges)
        val visited = BooleanArray(n)
        val (_, op) = dfs(cost, graph, visited, 0)
        return op
    }

    private fun dfs(cost: IntArray, graph: Array<MutableList<Int>>, visited: BooleanArray, node: Int): Pair<Long, Int> {
        // 방문 체
        if (visited[node]) {
            return -1L to 0
        }
        visited[node] = true
        // 자식 노드가 없으면 내가 미지막 노드다.
        if (graph[node].isEmpty()) {
            return cost[node] * 1L to 0
        }
        // 올라온 자식 노드들로부터 변경 횟수를 계산한다.
        val children = mutableListOf<Pair<Long, Int>>()
        var maxScore = 0L // 자식 노로부터 올라온 스코어 중 최대 스코어
        var sumOps = 0 // 자식들로부터 올라온 변경 회수 합계
        for (to in graph[node]) {
            val (score, op) = dfs(cost, graph, visited, to)
            if (score > -1L) {
                children += score to op
                if (score > maxScore) {
                    maxScore = score
                }
                sumOps += op
            }
        }
        // 최대 스코어보다 작은 자식 노드들은 숫자를 바꿔야 한다.
        val notMaxOps = children.count { (score, _) -> score < maxScore }
        // 최대 스코어와 변경 횟수를 위로 올림
        return cost[node] + maxScore to sumOps + notMaxOps
    }

    // 그래프를 만듦
    private fun graph(n: Int, edges: Array<IntArray>): Array<MutableList<Int>> {
        val graph = Array(n) { mutableListOf<Int>() }
        for ((u, v) in edges) {
            graph[u] += v
            graph[v] += u
        }
        return graph
    }
}
