package com.leetcode

import com.leetcode.P103.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P103Test {
    val sut = P103()

    @Test
    fun `example 1`() {
        val head = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        assertThat(
            sut.zigzagLevelOrder(head),
            `is`(
                listOf(
                    listOf(3),
                    listOf(20, 9),
                    listOf(15, 7)
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val head = TreeNode(1)
        assertThat(
            sut.zigzagLevelOrder(head),
            `is`(
                listOf(
                    listOf(1)
                )
            )
        )
    }

    @Test
    fun `example 3`() {
        val head = null
        assertThat(
            sut.zigzagLevelOrder(head),
            `is`(listOf())
        )
    }

    @Test
    fun `example 4`() {
        val head = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
        }
        assertThat(
            sut.zigzagLevelOrder(head),
            `is`(
                listOf(
                    listOf(1),
                    listOf(3, 2),
                    listOf(4, 5)
                )
            )
        )
    }

}
