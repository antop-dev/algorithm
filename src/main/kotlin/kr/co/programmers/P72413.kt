package kr.co.programmers

import java.util.*

class P72413 {
    companion object {
        const val INF = (100_000 * 200) + 1
    }

    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        // 지점 → (지점들,택시요금)
        val paths = paths(n, fares)
        // 다익스트라
        val office = dijkstra(paths, s) // S → Other
        val muzi = dijkstra(paths, a) // A → Other
        val apeach = dijkstra(paths, b) // B → Other
        // 합승 도착 지점 C를 기준으로 최소 비용 계산
        var ans = INF
        for (c in 1..n) {
            val cost = office[c] + muzi[c] + apeach[c]
            ans = minOf(ans, cost)
        }
        return ans
    }

    private fun paths(n: Int, fares: Array<IntArray>): Array<MutableList<Point>> {
        val paths = Array(n + 1) { mutableListOf<Point>() }
        for ((s, e, cost) in fares) {
            paths[s] += Point(e, cost)
            paths[e] += Point(s, cost)
        }
        return paths
    }

    private fun dijkstra(paths: Array<MutableList<Point>>, s: Int): IntArray {
        val costs = IntArray(paths.size) { INF }
        costs[s] = 0

        val pq = LinkedList<Point>()
        pq += Point(s, 0)

        while (pq.isNotEmpty()) {
            val curr = pq.poll()
            for (next in paths[curr.n]) {
                val nextCost = curr.cost + next.cost
                if (nextCost < costs[next.n]) {
                    costs[next.n] = nextCost
                    pq += Point(next.n, nextCost)
                }
            }
        }
        return costs
    }

    data class Point(val n: Int, val cost: Int)
}
