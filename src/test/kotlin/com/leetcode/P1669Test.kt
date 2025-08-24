package com.leetcode

import com.leetcode.P1669.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1669Test {
    val sut = P1669()

    @Test
    fun `example 1`() {
        val list1 = toListNode(10, 1, 13, 6, 9, 5)
        val list2 = toListNode(1000000, 1000001, 1000002)
        val ans = sut.mergeInBetween(list1, 3, 4, list2)
        assertThat(toArray(ans), `is`(intArrayOf(10, 1, 13, 1000000, 1000001, 1000002, 5)))
    }

    @Test
    fun `example 2`() {
        val list1 = toListNode(0, 1, 2, 3, 4, 5, 6)
        val list2 = toListNode(1000000, 1000001, 1000002, 1000003, 1000004)
        val ans = sut.mergeInBetween(list1, 2, 5, list2)
        assertThat(toArray(ans), `is`(intArrayOf(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6)))
    }

    private fun toListNode(vararg nums: Int): ListNode {
        val root = ListNode(nums[0])
        var node: ListNode? = root
        for (i in 1 until nums.size) {
            node?.next = ListNode(nums[i])
            node = node?.next
        }
        return root
    }

    private fun toArray(root: ListNode?): IntArray {
        val list = mutableListOf<Int>()
        var node = root
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        return list.toIntArray()
    }
}