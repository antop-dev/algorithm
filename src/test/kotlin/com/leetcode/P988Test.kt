package com.leetcode

import com.leetcode.P988.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P988Test {
    val sut = P988()

    @Test
    fun `example 1`() {
        val root = TreeNode(0).apply {
            left = TreeNode(1).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(5)
                right = TreeNode(6)
            }
        }
        assertThat(sut.smallestFromLeaf(root), `is`("dba"))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(25).apply {
            left = TreeNode(1).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(3).apply {
                left = TreeNode(0)
                right = TreeNode(2)
            }
        }
        assertThat(sut.smallestFromLeaf(root), `is`("adz"))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(2).apply {
            left = TreeNode(2).apply {
                right = TreeNode(1).apply {
                    left = TreeNode(0)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
            }
        }
        assertThat(sut.smallestFromLeaf(root), `is`("abc"))
    }

    @Test
    fun `example 4`() {
        val root = TreeNode(0).apply {
            right = TreeNode(1)
        }
        assertThat(sut.smallestFromLeaf(root), `is`("ba"))
    }
}