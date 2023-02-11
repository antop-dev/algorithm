package com.leetcode

// https://github.com/antop-dev/algorithm/issues/461
class P310 {
    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        if (n == 1) return listOf(0)
        // 그래프 생성
        val graph = List(n) { mutableListOf<Int>() }
        for (e in edges) {
            graph[e[0]] += e[1]
            graph[e[1]] += e[0]
        }
        // 마지막 잎이 될 수 있는 노드를 먼저 구한다.
        var leaves = mutableListOf<Int>()
        for (i in 0 until n) {
            if (graph[i].size == 1) {
                leaves.add(i)
            }
        }
        // 계산
        var num = n
        while (num > 2) {
            num -= leaves.size
            val newLeaves = mutableListOf<Int>()
            for (leaf in leaves) {
                val from = graph[leaf][0]
                graph[from] -= leaf
                if (graph[from].size == 1) {
                    newLeaves += from
                }
            }
            leaves = newLeaves
        }
        return leaves
    }

}
