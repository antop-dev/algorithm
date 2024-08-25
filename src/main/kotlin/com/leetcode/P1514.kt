package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/577
class P1514 {

    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, startNode: Int, endNode: Int): Double {
        val costs = graph(edges, succProb)
        val memo = DoubleArray(n)

        val comparator = Comparator.comparingDouble<Edge> { -it.cost }
        val pq = PriorityQueue(comparator)
        pq += Edge(startNode, 1.0)

        while (pq.isNotEmpty()) {
            repeat(pq.size) {
                val curr = pq.poll()
                costs[curr.node]?.forEach { next ->
                    val nextCost = curr.cost * next.cost
                    if (nextCost > memo[next.node]) { // 현재 노드->다음 노드의 확률이 높다면
                        memo[next.node] = nextCost
                        next.cost = memo[next.node]
                        pq += next
                    }
                }
            }
        }
        return memo[endNode]
    }

    // 그래프 구조 만들기
    private fun graph(edges: Array<IntArray>, succProb: DoubleArray): Map<Int, List<Edge>> {
        val graph = mutableMapOf<Int, MutableList<Edge>>()
        succProb.zip(edges) { prob, (s, e) ->
            graph[s]?.let { it += Edge(e, prob) } ?: run { graph[s] = mutableListOf(Edge(e, prob)) }
            graph[e]?.let { it += Edge(s, prob) } ?: run { graph[e] = mutableListOf(Edge(s, prob)) }
        }
        return graph
    }

    data class Edge(val node: Int, var cost: Double)

}
