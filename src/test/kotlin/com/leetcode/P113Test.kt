package com.leetcode

import com.leetcode.P113.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P113Test {
    val p = P113()

    @Test
    fun `example 01`() {
        val root = TreeNode(5).apply {
            left = TreeNode(4).apply {
                left = TreeNode(11).apply {
                    left = TreeNode(7)
                    right = TreeNode(2)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(13)
                right = TreeNode(4).apply {
                    left = TreeNode(5)
                    right = TreeNode(1)
                }
            }
        }
        assertThat(p.pathSum(root, 22), `is`(listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        assertThat(p.pathSum(root, 5), `is`(listOf()))
    }

    @Test
    fun `example 03`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
        }
        assertThat(p.pathSum(root, 0), `is`(listOf()))
    }

}
