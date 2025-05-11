package com.hackerrank

import kotlin.math.abs

class CutTheTree {
    fun cutTheTree(data: Array<Int>, edges: Array<Array<Int>>): Int {
        val n = data.size
        val graph = graph(n, edges)
        // 각 노드 번호가 루트일 때의 올라오는 합계 구하기
        val sum = IntArray(n + 1)
        dfs(sum, data, graph, BooleanArray(n + 1), 1)
        // 각 간선를 잘랏을 때 차이 구하기
        var ans = Int.MAX_VALUE
        val tree1 = sum[1] // tree1은 항상 1번 노드
        for ((from, to) in edges) {
            // 누적값이 큰 쪽이 상위 노드다
            var tree2 = sum[to]
            if (sum[to] > sum[from]) {
                tree2 = sum[from]
            }
            val diff = abs((tree1 - tree2) - tree2)
            ans = minOf(ans, diff)
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
        visited[vertex] = true
        var sum = data[vertex - 1]
        for (to in graph[vertex]) {
            if (visited[to]) { // 간선이 양방향이기 때문에 방문 체크해야 함
                continue
            }
            sum += dfs(result, data, graph, visited, to)
        }
        result[vertex] = sum
        return sum
    }
}