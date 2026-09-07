package com.leetcode

import com.leetcode.P430.Node
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P430Test {
    private val sut = P430()

    private fun nodes(vararg values: Int): Node? {
        var head: Node? = null
        var tail: Node? = null
        for (value in values) {
            val node = Node(value)
            if (head == null) {
                head = node
            } else {
                tail?.next = node
                node.prev = tail
            }
            tail = node
        }
        return head
    }

    private fun attach(head: Node?, index: Int, child: Node?): Node? {
        var node = head
        repeat(index) { node = node?.next }
        node?.child = child
        return head
    }

    private fun values(head: Node?): List<Int> {
        val list = mutableListOf<Int>()
        var node = head
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        return list
    }

    @Test
    fun `example 01`() {
        val head = nodes(1, 2, 3, 4, 5, 6)
        val child = nodes(7, 8, 9, 10)
        attach(child, 1, nodes(11, 12))
        attach(head, 2, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6)))
    }

    @Test
    fun `example 02`() {
        val head = nodes(1, 2)
        attach(head, 0, nodes(3))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 3, 2)))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.flatten(null), nullValue())
    }

    @Test
    fun `example 04`() {
        val head = nodes(1)
        assertThat(values(sut.flatten(head)), `is`(listOf(1)))
    }

    @Test
    fun `example 05`() {
        val head = nodes(1, 2, 3)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3)))
    }

    @Test
    fun `example 06`() {
        val head = nodes(1)
        attach(head, 0, nodes(2))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 07`() {
        val head = nodes(1, 2)
        attach(head, 1, nodes(3))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3)))
    }

    @Test
    fun `example 08`() {
        val head = nodes(1, 2, 3)
        attach(head, 1, nodes(4, 5))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 4, 5, 3)))
    }

    @Test
    fun `example 09`() {
        val head = nodes(1, 2, 3)
        val child = nodes(4)
        attach(child, 0, nodes(5))
        attach(head, 2, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `example 10`() {
        val head = nodes(1, 2, 3, 4)
        attach(head, 0, nodes(5, 6))
        attach(head, 2, nodes(7))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 5, 6, 2, 3, 7, 4)))
    }

    @Test
    fun `example 11`() {
        val head = nodes(1)
        var node = head
        for (value in 2..5) {
            val child = nodes(value)
            node?.child = child
            node = child
        }
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `example 12`() {
        val head = nodes(1, 2, 3, 4, 5)
        attach(head, 4, nodes(6, 7))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun `example 13`() {
        val head = nodes(1, 2)
        val child = nodes(3, 4)
        attach(child, 0, nodes(5))
        attach(head, 0, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 3, 5, 4, 2)))
    }

    @Test
    fun `example 14`() {
        val head = nodes(1, 2, 3)
        attach(head, 0, nodes(4))
        attach(head, 1, nodes(5))
        attach(head, 2, nodes(6))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 4, 2, 5, 3, 6)))
    }

    @Test
    fun `example 15`() {
        val head = nodes(10, 20, 30)
        val child = nodes(40, 50)
        attach(child, 1, nodes(60))
        attach(head, 1, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(10, 20, 40, 50, 60, 30)))
    }

    @Test
    fun `example 16`() {
        val head = nodes(*IntArray(1_000) { it + 1 })
        assertThat(values(sut.flatten(head)), `is`((1..1_000).toList()))
    }

    @Test
    fun `example 17`() {
        val head = nodes(1)
        var node = head
        for (value in 2..1_000) {
            val child = nodes(value)
            node?.child = child
            node = child
        }
        assertThat(values(sut.flatten(head)), `is`((1..1_000).toList()))
    }

    @Test
    fun `example 18`() {
        val head = nodes(1, 2, 3, 4)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4)))
    }

    @Test
    fun `example 19`() {
        val head = nodes(100_000)
        assertThat(values(sut.flatten(head)), `is`(listOf(100_000)))
    }

    @Test
    fun `example 20`() {
        val head = nodes(1, 2, 3)
        attach(head, 0, nodes(4, 5, 6))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 4, 5, 6, 2, 3)))
    }

    @Test
    fun `example 21`() {
        val head = nodes(1, 2, 3, 4)
        val child = nodes(5, 6)
        attach(child, 1, nodes(7, 8))
        attach(head, 3, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
    }

    @Test
    fun `example 22`() {
        val head = nodes(1, 2, 3, 4, 5, 6, 7, 8)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
    }

    @Test
    fun `example 23`() {
        val head = nodes(5, 4, 3, 2, 1)
        attach(head, 2, nodes(9))
        assertThat(values(sut.flatten(head)), `is`(listOf(5, 4, 3, 9, 2, 1)))
    }

    @Test
    fun `example 24`() {
        val head = nodes(1, 2)
        val child = nodes(3)
        attach(child, 0, nodes(4))
        attach(head, 0, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 3, 4, 2)))
    }

    @Test
    fun `example 25`() {
        val head = nodes(7)
        val child = nodes(8, 9)
        attach(child, 1, nodes(10))
        attach(head, 0, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(7, 8, 9, 10)))
    }

    @Test
    fun `example 26`() {
        val head = nodes(1, 2, 3, 4, 5)
        attach(head, 2, nodes(6))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 2, 3, 6, 4, 5)))
    }

    @Test
    fun `example 27`() {
        val head = nodes(1, 2, 3, 4, 5)
        attach(head, 0, nodes(6, 7, 8))
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 6, 7, 8, 2, 3, 4, 5)))
    }

    @Test
    fun `example 28`() {
        val head = nodes(2, 4, 6, 8)
        attach(head, 0, nodes(1, 3))
        attach(head, 3, nodes(5, 7))
        assertThat(values(sut.flatten(head)), `is`(listOf(2, 1, 3, 4, 6, 8, 5, 7)))
    }

    @Test
    fun `example 29`() {
        val head = nodes(1, 2, 3)
        val child = nodes(4, 5)
        attach(child, 1, nodes(6, 7))
        attach(head, 0, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(1, 4, 5, 6, 7, 2, 3)))
    }

    @Test
    fun `example 30`() {
        val head = nodes(9, 8, 7)
        val child = nodes(6)
        val grandChild = nodes(5)
        attach(grandChild, 0, nodes(4))
        attach(child, 0, grandChild)
        attach(head, 1, child)
        assertThat(values(sut.flatten(head)), `is`(listOf(9, 8, 6, 5, 4, 7)))
    }
}
