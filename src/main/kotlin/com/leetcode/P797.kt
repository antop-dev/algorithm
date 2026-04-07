package com.leetcode

// https://github.com/antop-dev/algorithm/issues/738
class P797 {
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        val paths = mutableListOf<List<Int>>()
        dfs(graph, paths, 0, listOf())
        return paths
    }

    private fun dfs(
        graph: Array<IntArray>,
        paths: MutableList<List<Int>>,
        node: Int,
        path: List<Int>
    ) {
        val p = path.toMutableList()
        p += node
        // 마지막 노드에 도착했을 때만 기록
        if (node == graph.lastIndex) {
            paths += p
        }
        // 다음 노드로 계속 탐색
        for (next in graph[node]) {
            dfs(graph, paths, next, p)
        }
    }
}
