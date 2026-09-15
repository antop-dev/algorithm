package com.leetcode

import com.leetcode.P3217.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3217Test {
    private val sut = P3217()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(1, 2, 3)
        val head = listOf(1, 2, 3, 4, 5).toListNode()
        val actual = sut.modifyList(nums, head).toList()
        val expected = listOf(4, 5)
        assertThat(actual, `is`(expected))
    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(1)
        val head = listOf(1, 2, 1, 2, 1, 2).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(2, 2, 2)))
    }

    @Test
    fun `example 03`() {
        val nums = intArrayOf(5)
        val head = listOf(1, 2, 3, 4).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2, 3, 4)))
    }

    @Test
    fun `example 04`() {
        val nums = intArrayOf(2)
        val head = listOf(1).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1)))
    }

    @Test
    fun `example 05`() {
        val nums = intArrayOf(1)
        val head = listOf(1, 1, 1, 2).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(2)))
    }

    @Test
    fun `example 06`() {
        val nums = intArrayOf(3, 4)
        val head = listOf(3, 4, 5, 3, 4, 6).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(5, 6)))
    }

    @Test
    fun `example 07`() {
        val nums = intArrayOf(100000)
        val head = listOf(100000, 1).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1)))
    }

    @Test
    fun `example 08`() {
        val nums = intArrayOf(1)
        val head = listOf(2).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(2)))
    }

    @Test
    fun `example 09`() {
        val nums = intArrayOf(7)
        val head = listOf(7, 7, 7, 7, 1).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1)))
    }

    @Test
    fun `example 10`() {
        val nums = intArrayOf(1, 3, 5)
        val head = listOf(1, 2, 3, 4, 5, 6).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(2, 4, 6)))
    }

    @Test
    fun `example 11`() {
        val nums = intArrayOf(2, 4, 6)
        val head = listOf(1, 2, 3, 4, 5, 6).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 3, 5)))
    }

    @Test
    fun `example 12`() {
        val nums = intArrayOf(10)
        val head = listOf(1, 10, 2, 10, 3, 10, 4).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2, 3, 4)))
    }

    @Test
    fun `example 13`() {
        val nums = intArrayOf(1, 2)
        val head = listOf(3, 1, 2, 3, 1, 2, 3).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(3, 3, 3)))
    }

    @Test
    fun `example 14`() {
        val nums = intArrayOf(9, 8, 7)
        val head = listOf(1, 9, 2, 8, 3, 7, 4).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2, 3, 4)))
    }

    @Test
    fun `example 15`() {
        val nums = intArrayOf(100000, 99999)
        val head = listOf(99999, 100000, 1, 2).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 16`() {
        val nums = intArrayOf(5, 10, 15)
        val head = listOf(5, 10, 15, 20, 25, 30).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(20, 25, 30)))
    }

    @Test
    fun `example 17`() {
        val nums = intArrayOf(1)
        val head = listOf(1, 1, 1, 1, 1, 2, 1, 1).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(2)))
    }

    @Test
    fun `example 18`() {
        val nums = intArrayOf(4)
        val head = listOf(1, 2, 3, 5, 6).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2, 3, 5, 6)))
    }

    @Test
    fun `example 19`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val head = listOf(5, 4, 3, 2, 1, 6).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(6)))
    }

    @Test
    fun `example 20`() {
        val nums = intArrayOf(2, 3)
        val head = listOf(1, 2, 2, 3, 3, 1).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 1)))
    }

    @Test
    fun `example 21`() {
        val nums = intArrayOf(6, 7, 8, 9)
        val head = listOf(9, 8, 7, 6, 5, 4, 3).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(5, 4, 3)))
    }

    @Test
    fun `example 22`() {
        val nums = intArrayOf(50000)
        val head = listOf(50000, 50000, 50001).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(50001)))
    }

    @Test
    fun `example 23`() {
        val nums = intArrayOf(1, 100000)
        val head = listOf(1, 100000, 50000).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(50000)))
    }

    @Test
    fun `example 24`() {
        val nums = intArrayOf(11, 22, 33)
        val head = listOf(11, 12, 22, 23, 33, 34).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(12, 23, 34)))
    }

    @Test
    fun `example 25`() {
        val nums = intArrayOf(3)
        val head = listOf(3, 3, 3, 1, 3, 3, 2, 3).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 26`() {
        val nums = intArrayOf(2, 5, 8)
        val head = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1, 3, 4, 6, 7, 9)))
    }

    @Test
    fun `example 27`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val head = listOf(4, 3, 2, 1, 5, 1, 2, 3, 4).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(5)))
    }

    @Test
    fun `example 28`() {
        val nums = intArrayOf(12)
        val head = listOf(10, 11, 13, 14).toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(10, 11, 13, 14)))
    }

    // 노드가 최대(100,000)이고 삭제 대상도 최대인 경우
    @Test
    fun `example 29`() {
        val nums = (2..100000).toList().toIntArray()
        val head = (1..100000).toList().toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`(listOf(1)))
    }

    // 노드가 최대(100,000)이고 삭제 대상은 최소(1개)인 경우
    @Test
    fun `example 30`() {
        val nums = intArrayOf(100000)
        val head = (1..100000).toList().toListNode()
        assertThat(sut.modifyList(nums, head).toList(), `is`((1..99999).toList()))
    }

    private fun List<Int>.toListNode(): ListNode? {
        val dummy = ListNode(0)
        var curr = dummy
        for (v in this) {
            curr.next = ListNode(v)
            curr = curr.next!!
        }
        return dummy.next
    }

    private fun ListNode?.toList(): List<Int> {
        val result = mutableListOf<Int>()
        var node = this
        while (node != null) {
            result.add(node.`val`)
            node = node.next
        }
        return result
    }
}
