package com.leetcode

// https://github.com/antop-dev/algorithm/issues/643
class P802 {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        val memo = Array<Boolean?>(graph.size) { null }
        graph.indices.forEach { i -> dfs(graph, memo, i, mutableSetOf<Int>()) }
        // 안전 노드 번호 필터링
        return memo.mapIndexedNotNull { i, bool -> if (bool == true) i else null }
    }

    fun dfs(graph: Array<IntArray>, memo: Array<Boolean?>, current: Int, path: MutableSet<Int>): Boolean {
        memo[current]?.run { // 탐색했던 노드
            return this
        }
        if (graph[current].isEmpty()) { // 터미널 노드
            memo[current] = true
            return true
        }
        if (current in path) { // 순환 참조
            return false
        }
        // 터미널 노드로 가지 않는 간선이 있으면 안전 노드가 아니다
        path += current
        var safe = true
        for (next in graph[current]) {
            if (!dfs(graph, memo, next, path)) {
                safe = false
                break
            }
        }
        // 현재 노드는 안전 노드인가?
        memo[current] = safe
        return safe
    }
}
