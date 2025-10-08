package kr.co.programmers

import java.util.PriorityQueue

// https://programmers.co.kr/learn/courses/30/lessons/43163
class P43163 {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val graph = graph(begin, words)
        val steps = bfs(graph, begin)
        return steps[target] ?: 0
    }

    private fun bfs(graph: Map<String, Set<String>>, begin: String): Map<String, Int> {
        val steps = mutableMapOf<String, Int>()
        val queue = PriorityQueue<Pair<String, Int>> { o1, o2 -> o1.second - o2.second }
        queue += begin to 0

        while (queue.isNotEmpty()) {
            val (node, step) = queue.poll()
            steps[node] = step

            val tos = graph[node] ?: setOf()
            for (to in tos) {
                if (step + 1 >= (steps[to] ?: Int.MAX_VALUE)) {
                    continue
                }
                queue += to to step + 1
            }
        }
        return steps
    }

    private fun graph(begin: String, words: Array<String>): Map<String, Set<String>> {
        val graph = mutableMapOf<String, MutableSet<String>>()
        val list = words + begin

        for (i in list.indices) {
            for (j in list.indices) {
                if (i == j) {
                    continue
                }
                val a = list[i]
                val b = list[j]
                val diff = a.zip(b).count { (c1, c2) -> c1 != c2 }
                if (diff == 1) {
                    graph[a] = graph[a]?.also { it += b } ?: mutableSetOf(b)
                    graph[b] = graph[b]?.also { it += a } ?: mutableSetOf(a)
                }
            }
        }
        return graph
    }
}
