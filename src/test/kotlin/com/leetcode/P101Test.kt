package com.leetcode

import com.leetcode.P101.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P101Test {
    val p = P101()

    @Test
    fun `example 1`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(3)
            }
        }
        assertThat(p.isSymmetric(root), `is`(true))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(3)
            }
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }
        assertThat(p.isSymmetric(root), `is`(false))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
            }
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }
        assertThat(p.isSymmetric(root), `is`(true))
    }
}
