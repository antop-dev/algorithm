package kr.co.programmers

import java.util.LinkedList
import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/686
class P76503 {
    fun solution(a: IntArray, edges: Array<IntArray>): Long {
        val b = a.map { it.toLong() }.toLongArray()
        // 그래프 구성 및 진입 차수 계산
        val degree = IntArray(a.size)
        val graph = mutableMapOf<Int, MutableList<Int>>()
        for ((from, to) in edges) {
            // 진입 차수 증가
            degree[from]++
            degree[to]++
            // 양방향으로 연결
            graph[from] = graph[from]?.apply { this += to } ?: mutableListOf(to)
            graph[to] = graph[to]?.apply { this += from } ?: mutableListOf(from)
        }
        // 방문 여부
        val visited = BooleanArray(a.size)
        // 진입 차수가 1인 점을 큐에 넣고 시작
        val queue = LinkedList<Int>()
        for (dot in degree.indices) {
            if (degree[dot] == 1) {
                queue += dot
            }
        }
        var v = 0L // 마지막 탐색 점의 값
        var op = 0L // 연산 횟수
        while (queue.isNotEmpty()) {
            val dot = queue.poll()
            visited[dot] = true
            v = b[dot]
            val tos = graph[dot] ?: setOf()
            for (to in tos) {
                if (visited[to]) continue
                b[to] += b[dot]
                op += abs(b[dot])
                degree[to]--
                if (degree[to] == 1) {
                    queue += to
                }
            }
        }
        return if (v == 0L) op else -1L
    }
}