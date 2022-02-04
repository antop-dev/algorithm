package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/372
class P49189 {

    fun solution(n: Int, edge: Array<IntArray>): Int {
        // node -> [to, to, to]
        val graph = mutableMapOf<Int, MutableSet<Int>>()
        for (i in 1..n) graph[i] = mutableSetOf()
        for (e in edge) {
            graph[e[0]]!! += e[1]
            graph[e[1]]!! += e[0]
        }

        var answer = 0
        // BFS
        val visited = mutableSetOf<Int>()
        val queue = LinkedList<Int>().apply { this += 1 }
        while (queue.isNotEmpty()) {
            var count = 0
            for (i in 0 until queue.size) {
                val node = queue.poll()
                if (visited.contains(node)) continue
                count++
                visited += node
                for (to in graph[node]!!) queue += to
            }
            if (count > 0) answer = count
        }

        return answer
    }

}
