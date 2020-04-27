package com.leetcode

import com.leetcode.P98.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P98Test {
    val p = P98()

    @Test
    fun `example 1`() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertThat(p.isValidBST(root), `is`(true))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(5).apply {
            left = TreeNode(1)
            right = TreeNode(4).apply {
                left = TreeNode(3)
                right = TreeNode(6)
            }
        }
        assertThat(p.isValidBST(root), `is`(false))
    }

    @Test
    fun `example 3`() {
        val root = null
        assertThat(p.isValidBST(root), `is`(true))
    }

    @Test
    fun `example 4`() {
        val root = TreeNode(1).apply {
            left = TreeNode(1)
        }
        assertThat(p.isValidBST(root), `is`(false))
    }

    @Test
    fun `example 5`() {
        val root = TreeNode(10).apply {
            left = TreeNode(5)
            right = TreeNode(15).apply {
                left = TreeNode(6)
                right = TreeNode(20)
            }
        }
        assertThat(p.isValidBST(root), `is`(false))
    }

    @Test
    fun `example 6`() {
        val root = TreeNode(3).apply {
            left = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(2)
            }
            right = TreeNode(5).apply {
                left = TreeNode(4)
                right = TreeNode(6)
            }
        }
        assertThat(p.isValidBST(root), `is`(true))
    }

    @Test
    fun `example 7`() {
        val root = TreeNode(24).apply {
            left = TreeNode(-60).apply {
                left = TreeNode(-60)
                right = TreeNode(-6)
            }
        }
        assertThat(p.isValidBST(root), `is`(false))
    }

    @Test
    fun `example 8`() {
        val root = TreeNode(Int.MIN_VALUE)
        assertThat(p.isValidBST(root), `is`(true))
    }
}