package com.leetcode

import com.leetcode.P133.Node
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P133Test {
    private val sut = P133()

    private fun graph(adjList: List<List<Int>>): Node? {
        if (adjList.isEmpty()) return null
        val nodes = List(adjList.size) { Node(it + 1) }
        adjList.forEachIndexed { i, neighbors ->
            neighbors.forEach { nodes[i].neighbors.add(nodes[it - 1]) }
        }
        return nodes[0]
    }

    private fun collect(node: Node?): List<Node> {
        if (node == null) return emptyList()
        val visited = linkedSetOf<Node>()
        val queue = ArrayDeque(listOf(node))
        visited.add(node)
        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            for (next in cur.neighbors) {
                if (next != null && visited.add(next)) queue.add(next)
            }
        }
        return visited.sortedBy { it.`val` }
    }

    private fun toAdjList(node: Node?): List<List<Int>> =
        collect(node).map { n -> n.neighbors.map { it!!.`val` } }

    // 원본과 복제본이 같은 노드 객체를 하나도 공유하지 않는지 확인
    private fun isDeepCopy(original: Node?, cloned: Node?): Boolean {
        val origin = collect(original).toSet()
        return collect(cloned).none { it in origin }
    }

    @Test
    fun `example 01`() {
        val adjList = listOf(listOf(2, 4), listOf(1, 3), listOf(2, 4), listOf(1, 3))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 1개인 경우
    @Test
    fun `example 02`() {
        val adjList = listOf(emptyList<Int>())
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 빈 그래프인 경우
    @Test
    fun `example 03`() {
        val adjList = emptyList<List<Int>>()
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 2개인 경우
    @Test
    fun `example 04`() {
        val adjList = listOf(listOf(2), listOf(1))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 05`() {
        val adjList = listOf(listOf(2), listOf(1, 3), listOf(2))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 06`() {
        val adjList = listOf(listOf(2, 3), listOf(1, 3), listOf(1, 2))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 07`() {
        val adjList = listOf(listOf(2, 3, 4), listOf(1), listOf(1), listOf(1))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 08`() {
        val adjList = listOf(listOf(2, 3, 4), listOf(1, 3, 4), listOf(1, 2, 4), listOf(1, 2, 3))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 09`() {
        val adjList = listOf(listOf(2), listOf(1, 3), listOf(2, 4), listOf(3, 5), listOf(4))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 10`() {
        val adjList = listOf(listOf(2, 5), listOf(1, 3), listOf(2, 4), listOf(3, 5), listOf(1, 4))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 11`() {
        val adjList = listOf(listOf(2), listOf(1, 3, 4, 5), listOf(2), listOf(2), listOf(2))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 12`() {
        val adjList = listOf(listOf(2, 3, 4, 5), listOf(1, 3, 4, 5), listOf(1, 2, 4, 5), listOf(1, 2, 3, 5), listOf(1, 2, 3, 4))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 13`() {
        val adjList = listOf(listOf(2, 3), listOf(1, 4, 5), listOf(1, 6, 7), listOf(2), listOf(2), listOf(3), listOf(3))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 14`() {
        val adjList = listOf(listOf(2, 6), listOf(1, 3), listOf(2, 4), listOf(3, 5), listOf(4, 6), listOf(1, 5))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 15`() {
        val adjList = listOf(listOf(2, 4), listOf(1, 3, 5), listOf(2, 6), listOf(1, 5), listOf(2, 4, 6), listOf(3, 5))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 16`() {
        val adjList = listOf(listOf(2, 3, 4), listOf(1, 3), listOf(1, 2, 4), listOf(1, 3))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 17`() {
        val adjList = listOf(listOf(6), listOf(3), listOf(2, 4), listOf(3, 5), listOf(4, 6), listOf(1, 5))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 18`() {
        val adjList = listOf(listOf(2, 4, 5), listOf(1, 3, 6), listOf(2, 4, 7), listOf(1, 3, 8), listOf(1, 6, 8), listOf(2, 5, 7), listOf(3, 6, 8), listOf(4, 5, 7))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 19`() {
        val adjList = listOf(listOf(4, 5, 6), listOf(4, 5, 6), listOf(4, 5, 6), listOf(1, 2, 3), listOf(1, 2, 3), listOf(1, 2, 3))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 20`() {
        val adjList = listOf(listOf(2, 10), listOf(1, 3), listOf(2, 4, 8), listOf(3, 5), listOf(4, 6), listOf(5, 7), listOf(6, 8), listOf(3, 7, 9), listOf(8, 10), listOf(1, 9))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 21`() {
        val adjList = listOf(listOf(2, 3, 7, 9), listOf(1, 3, 4, 10), listOf(1, 2, 5), listOf(2, 15), listOf(3, 6, 8, 11, 13, 14), listOf(5, 7), listOf(1, 6, 9), listOf(5), listOf(1, 7), listOf(2), listOf(5, 12), listOf(11), listOf(5, 15), listOf(5), listOf(4, 13))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 22`() {
        val adjList = listOf(listOf(2, 3, 5), listOf(1, 4, 5, 7, 9, 11, 14), listOf(1, 4), listOf(2, 3), listOf(1, 2, 6, 8, 13), listOf(5, 10, 12), listOf(2, 9), listOf(5, 14), listOf(2, 7), listOf(6), listOf(2), listOf(6), listOf(5), listOf(2, 8))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 23`() {
        val adjList = listOf(listOf(2, 9), listOf(1, 3), listOf(2, 4, 5, 14), listOf(3, 6, 10, 14), listOf(3, 7, 8), listOf(4, 8), listOf(5, 10, 11, 12, 14), listOf(5, 6), listOf(1, 13), listOf(4, 7), listOf(7), listOf(7), listOf(9), listOf(3, 4, 7))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 24`() {
        val adjList = listOf(listOf(2, 3, 4, 5, 7, 8), listOf(1, 6, 9), listOf(1, 8), listOf(1, 6, 10, 11), listOf(1, 6, 11), listOf(2, 4, 5), listOf(1), listOf(1, 3), listOf(2), listOf(4), listOf(4, 5))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    @Test
    fun `example 25`() {
        val adjList = listOf(listOf(2, 4, 6, 8, 9), listOf(1, 3, 5, 8), listOf(2, 4, 8), listOf(1, 3), listOf(2, 7), listOf(1), listOf(5, 9), listOf(1, 2, 3), listOf(1, 7))
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 최대(100개)인 경우 - 경로
    @Test
    fun `example 26`() {
        val adjList = List(100) { i -> listOfNotNull(if (i > 0) i else null, if (i < 99) i + 2 else null) }
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 최대(100개)인 경우 - 사이클
    @Test
    fun `example 27`() {
        val adjList = List(100) { i -> listOf((i + 99) % 100 + 1, (i + 1) % 100 + 1).sorted() }
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 최대(100개)인 경우 - 스타
    @Test
    fun `example 28`() {
        val adjList = List(100) { i -> if (i == 0) (2..100).toList() else listOf(1) }
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 최대(100개)인 경우 - 완전 그래프
    @Test
    fun `example 29`() {
        val adjList = List(100) { i -> (1..100).filter { it != i + 1 } }
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }

    // 노드가 최대(100개)인 경우 - 이진 트리
    @Test
    fun `example 30`() {
        val adjList = List(100) { i -> listOfNotNull(if (i > 0) (i + 1) / 2 else null, if (2 * (i + 1) <= 100) 2 * (i + 1) else null, if (2 * (i + 1) + 1 <= 100) 2 * (i + 1) + 1 else null) }
        val node = graph(adjList)
        val cloned = sut.cloneGraph(node)
        assertThat(toAdjList(cloned), `is`(adjList))
        assertThat(isDeepCopy(node, cloned), `is`(true))
    }
}
