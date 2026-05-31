package com.leetcode

import com.leetcode.P2583.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2583Test {
    val sut = P2583()

    @Test
    fun `example 1`() {
        val root = TreeNode(5).apply {
            left = TreeNode(8).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(4)
                    right = TreeNode(6)
                }
                right = TreeNode(1)
            }
            right = TreeNode(9).apply {
                left = TreeNode(3)
                right = TreeNode(7)
            }
        }
        assertThat(sut.kthLargestLevelSum(root, 2), `is`(13L))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }
        assertThat(sut.kthLargestLevelSum(root, 1), `is`(3L))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(5).apply {
            left = TreeNode(8).apply {
                left = TreeNode(2)
                right = TreeNode(1)
            }
            right = TreeNode(9).apply {
                left = TreeNode(8)
                right = TreeNode(7)
            }
        }
        assertThat(sut.kthLargestLevelSum(root, 4), `is`(-1))
    }
}
