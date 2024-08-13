package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/575
class P132266 {

    fun solution(n: Int, roads: Array<IntArray>, sources: IntArray, destination: Int): IntArray {
        val graph = graph(n, roads)
        val times = IntArray(n + 1) { -1 }
        val visited = BooleanArray(n + 1)

        val queue = LinkedList<Int>()
        queue += destination // 강철부대 지역

        var time = 0
        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val loc = queue.poll()
                if (visited[loc]) return@repeat
                times[loc] = time
                visited[loc] = true
                graph[loc]?.forEach { to -> queue += to }
            }
            time++
        }

        return sources.map { times[it] }.toIntArray()
    }

    private fun graph(n: Int, roads: Array<IntArray>): Map<Int, List<Int>> {
        val graph = mutableMapOf<Int, MutableList<Int>>()
        for ((from, to) in roads) {
            addGraph(graph, from, to)
            addGraph(graph, to, from)
        }
        return graph
    }

    private fun addGraph(graph: MutableMap<Int, MutableList<Int>>, from: Int, to: Int) {
        graph[from]?.let { it += to } ?: run { graph[from] = mutableListOf(to) }
    }

}
