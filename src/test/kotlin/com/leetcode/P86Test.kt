package com.leetcode

import com.leetcode.P86.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P86Test {
    val sut = P86()

    @Test
    fun `example 1`() {
        val head = makeListNode(1, 4, 3, 2, 5, 2)
        val answer = sut.partition(head, 3)
        assertThat(makeArray(answer), `is`(intArrayOf(1, 2, 2, 4, 3, 5)))
    }

    @Test
    fun `example 2`() {
        val head = makeListNode(2, 1)
        val answer = sut.partition(head, 2)
        assertThat(makeArray(answer), `is`(intArrayOf(1, 2)))
    }

    private fun makeListNode(vararg nums: Int): ListNode {
        val head = ListNode(nums[0])
        var node = head
        for (i in 1 until nums.size) {
            val n = ListNode(nums[i])
            node.next = n
            node = n
        }
        return head
    }

    private fun makeArray(head: ListNode?): IntArray {
        var node: ListNode? = head
        val list = mutableListOf<Int>()
        while (node != null) {
            list += node.`val`
            node = node.next
        }
        return list.toIntArray()
    }

}
