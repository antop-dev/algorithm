package com.leetcode

// https://github.com/antop-dev/algorithm/issues/613
class P3249 {
    fun countGoodNodes(edges: Array<IntArray>): Int {
        val visited = BooleanArray(100_000)
        val graph = graph(edges)
        val result = dfs(graph, visited, 0)
        return result.goods
    }

    // 양방향 그래프 구성
    private fun graph(edges: Array<IntArray>): Map<Int, Set<Int>> {
        val graph = mutableMapOf<Int, MutableSet<Int>>()
        for (edge in edges) {
            graph.computeIfAbsent(edge[0]) { mutableSetOf() }.add(edge[1])
            graph.computeIfAbsent(edge[1]) { mutableSetOf() }.add(edge[0])
        }
        return graph
    }

    private fun dfs(graph: Map<Int, Set<Int>>, visited: BooleanArray, node: Int): Result {
        // 이미 방문한 노드는 무시
        if (visited[node]) {
            return Result(0, 0)
        }
        // 방문 체크
        visited[node] = true
        // 자식 노드가 없으면 현재 노드는 굿 노드다.
        val children = graph[node]
        if (children.isNullOrEmpty()) {
            return Result(1, 1)
        }
        // 자식 노드들 DFS
        val results = children
            .filter { !visited[it] }
            .map { dfs(graph, visited, it) }

        var nodesSum = 0 // 자식들의 노드 개수 합
        var goodsSum = 0 // 자식들의 굿 노드 개수 합
        var same = true // 자식들의 굿 노드 개수가 모두 같은지 여부
        for ((nodes, goods) in results) {
            nodesSum += nodes
            goodsSum += goods
            if (same && results[0].nodes != nodes) {
                same = false
            }
        }

        return Result(
            nodes = nodesSum + 1,
            goods = goodsSum + (if (same) 1 else 0)
        )
    }

    data class Result(val nodes: Int, val goods: Int)
}
