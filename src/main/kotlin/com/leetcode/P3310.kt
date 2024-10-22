package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/594
class P3310 {
    fun remainingMethods(n: Int, k: Int, invocations: Array<IntArray>): List<Int> {
        val graph = graph(invocations)
        val bugMethods = findBugMethods(n, k, graph)
        val referenced = isReferToBugMethods(n, graph, bugMethods)

        val ans = (0 until n).toMutableSet()
        if (!referenced) {
            ans -= bugMethods
        }
        return ans.toList()
    }

    // 다른 노드들이 버그 메서드들을 하나라도 참조하는지 검사
    private fun isReferToBugMethods(n: Int, graph: Map<Int, Set<Int>>, bugs: MutableSet<Int>): Boolean {
        for (m in 0 until n) {
            if (m in bugs) {
                continue
            }
            graph[m]?.forEach { to ->
                if (to in bugs) {
                    return true
                }
            }
        }
        return false
    }

    // BFS로 버그 메서드들의 번호 찾기
    private fun findBugMethods(n: Int, k: Int, graph: Map<Int, Set<Int>>): MutableSet<Int> {
        val set = mutableSetOf<Int>()
        val visited = BooleanArray(n)
        val queue = LinkedList<Int>()
        queue += k
        while (queue.isNotEmpty()) {
            val m = queue.poll()
            visited[m] = true
            set += m
            graph[m]?.forEach { to ->
                if (!visited[to]) {
                    queue += to
                }
            }
        }
        return set
    }

    // 그래프 생성
    private fun graph(invocations: Array<IntArray>): Map<Int, Set<Int>> {
        val graph = mutableMapOf<Int, MutableSet<Int>>()
        for ((from, to) in invocations) {
            graph[from]?.let {
                it += to
            } ?: run {
                graph[from] = mutableSetOf(to)
            }
        }
        return graph
    }
}
