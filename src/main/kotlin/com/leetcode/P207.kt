package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/474
class P207 {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        // 몇개의 다른 노드로부터 자신의 노드로 오는지 카운팅하는 변수
        val lines = IntArray(numCourses)
        // 그래프 완성
        val graph = mutableMapOf<Int, MutableList<Int>>()
        repeat(numCourses) { i -> graph[i] = mutableListOf() }
        for ((to, from) in prerequisites) {
            graph[from]!! += to
            lines[to]++
        }

        val queue = LinkedList<Int>()
        // 출발 노드를 찾는다.
        for (i in lines.indices) {
            if (lines[i] == 0) {
                queue += i
            }
        }

        var count = 0
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            count++
            for (next in graph[node]!!) {
                lines[next]--
                if (lines[next] == 0) {
                    queue += next
                }
            }
        }

        return count == numCourses
    }
}
