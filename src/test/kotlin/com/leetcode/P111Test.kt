package com.leetcode

import com.leetcode.P111.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P111Test {
    val p = P111()

    @Test
    fun `example 1`() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        assertThat("minimum depth = 2.", p.minDepth(root), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat("minimum depth = 0.", p.minDepth(null), `is`(0))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
        }
        assertThat("minimum depth = 2.", p.minDepth(root), `is`(2))
    }

    @Test
    fun `example 4`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4).apply {
                        left = TreeNode(5)
                    }
                }
            }
        }
        assertThat("minimum depth = 5.", p.minDepth(root), `is`(5))
    }

}
