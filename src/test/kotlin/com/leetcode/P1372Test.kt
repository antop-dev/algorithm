package com.leetcode

import com.leetcode.P1372.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1372Test {
    val p = P1372()

    @Test
    fun `example 01`() {
        val root = TreeNode(1).apply {
            right = TreeNode(1).apply {
                left = TreeNode(1)
                right = TreeNode(1).apply {
                    left = TreeNode(1).apply {
                        right = TreeNode(1).apply {
                            right = TreeNode(1)
                        }
                    }
                    right = TreeNode(1)
                }
            }
        }
        assertThat(p.longestZigZag(root), `is`(3))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(1).apply {
            left = TreeNode(1).apply {
                right = TreeNode(1).apply {
                    left = TreeNode(1).apply {
                        right = TreeNode(1)
                    }
                    right = TreeNode(1)
                }
            }
            right = TreeNode(1)
        }
        assertThat(p.longestZigZag(root), `is`(4))
    }

    @Test
    fun `example 03`() {
        val root = TreeNode(1)
        assertThat(p.longestZigZag(root), `is`(0))
    }
}
