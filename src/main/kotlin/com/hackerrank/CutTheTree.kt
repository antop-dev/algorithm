package com.hackerrank

import kotlin.math.abs
import kotlin.math.min

// https://github.com/antop-dev/algorithm/issues/653
class CutTheTree {
    fun cutTheTree(data: Array<Int>, edges: Array<Array<Int>>): Int {
        val n = data.size
        val graph = graph(n, edges)
        // 각 노드 번호가 루트일 때의 올라오는 합계 구하기
        val sum = IntArray(n + 1)
        dfs(sum, data, graph, BooleanArray(n + 1), 1)
        // 루트 노드와 각 노드들의 최소 차이를 구한다.
        var ans = sum[1]
        for (i in 2..n) {
            val diff = abs(sum[1] - sum[i] - sum[i])
            ans = min(ans, diff)
        }
        return ans
    }

    // 그래프 생성
    private fun graph(n: Int, edge: Array<Array<Int>>): Array<MutableSet<Int>> {
        val graph = Array(n + 1) { mutableSetOf<Int>() }
        for ((from, to) in edge) {
            graph[from] += to
            graph[to] += from
        }
        return graph
    }

    private fun dfs(
        result: IntArray,
        data: Array<Int>,
        graph: Array<MutableSet<Int>>,
        visited: BooleanArray,
        vertex: Int,
    ): Int {
        if (visited[vertex]) { // 이미 방문한 곳
            return 0
        }
        visited[vertex] = true
        var sum = data[vertex - 1]
        for (to in graph[vertex]) {
            sum += dfs(result, data, graph, visited, to)
        }
        result[vertex] = sum
        return sum
    }
}