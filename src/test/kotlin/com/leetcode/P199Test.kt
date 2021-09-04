package com.leetcode

import com.leetcode.P199.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P199Test {
    val p = P199()

    @Test
    fun `example 01`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(5)
            }
            right = TreeNode(3).apply {
                right = TreeNode(4)
            }
        }
        assertThat(p.rightSideView(root), `is`(listOf(1, 3, 4)))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(1).apply {
            right = TreeNode(3)
        }
        assertThat(p.rightSideView(root), `is`(listOf(1, 3)))
    }

    @Test
    fun `example 03`() {
        val root = null
        assertThat(p.rightSideView(root), `is`(listOf()))
    }

    @Test
    fun `example 04`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
        }
        assertThat(p.rightSideView(root), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 05`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
            }
            right = TreeNode(3)
        }
        assertThat(p.rightSideView(root), `is`(listOf(1, 3, 4)))
    }

}
