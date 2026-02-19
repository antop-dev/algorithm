package com.leetcode

import com.leetcode.P1305.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1305Test {
    private val sut = P1305()

    @Test
    fun `example 01`() {
        val root1 = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(4)
        }
        val root2 = TreeNode(1).apply {
            left = TreeNode(0)
            right = TreeNode(3)
        }
        assertThat(sut.getAllElements(root1, root2), `is`(listOf(0, 1, 1, 2, 3, 4)))
    }

    @Test
    fun `example 02`() {
        val root1 = TreeNode(1).apply {
            right = TreeNode(8)
        }
        val root2 = TreeNode(8).apply {
            left = TreeNode(1)
        }
        assertThat(sut.getAllElements(root1, root2), `is`(listOf(1, 1, 8, 8)))
    }
}
