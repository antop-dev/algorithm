package com.leetcode

import com.leetcode.P230.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P230Test {
    val p = P230()

    @Test
    fun `example 01`() {
        val root = TreeNode(3).apply {
            left = TreeNode(1).apply {
                right = TreeNode(2)
            }
            right = TreeNode(4)
        }
        assertThat(p.kthSmallest(root, 1), `is`(1))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                }
                right = TreeNode(4)
            }
            right = TreeNode(6)
        }
        assertThat(p.kthSmallest(root, 3), `is`(3))
    }

    @Test
    fun `example 03`() {
        val root = TreeNode(8).apply {
            left = TreeNode(4).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                    right = TreeNode(3)
                }
                right = TreeNode(5).apply {
                    right = TreeNode(4)
                    right = TreeNode(6)
                }
            }
            right = TreeNode(9)
        }
        assertThat(p.kthSmallest(root, 3), `is`(3))
    }

    @Test
    fun `example 05`() {
        val root = TreeNode(8).apply {
            left = TreeNode(4).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                    right = TreeNode(3)
                }
                right = TreeNode(5).apply {
                    right = TreeNode(4)
                    right = TreeNode(6)
                }
            }
            right = TreeNode(9)
        }
        assertThat(p.kthSmallest(root, 3), `is`(3))
    }

}
