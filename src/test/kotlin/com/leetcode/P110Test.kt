package com.leetcode

import com.leetcode.P110.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P110Test {
    val p = P110()

    @Test
    fun `example 1`() {
        // [3,9,20,null,null,15,7]
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        assertThat(p.isBalanced(root), `is`(true))
    }

    @Test
    fun `example 2`() {
        // [1,2,2,3,3,null,null,4,4]
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                    right = TreeNode(4)
                }
                right = TreeNode(3)
            }
            right = TreeNode(2)
        }
        assertThat(p.isBalanced(root), `is`(false))
    }

    @Test
    fun `example 3`() {
        // [1,null,3,2]
        val root = TreeNode(1).apply {
            right = TreeNode(3).apply {
                left = TreeNode(2)
            }
        }
        assertThat(p.isBalanced(root), `is`(false))
    }

    @Test
    fun `example 4`() {
        // [1,null,3,2]
        val root = null
        assertThat(p.isBalanced(root), `is`(true))
    }

    @Test
    fun `example 5`() {
        // [1]
        val root = TreeNode(1)
        assertThat(p.isBalanced(root), `is`(true))
    }

    @Test
    fun `example 6`() {
        // [1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5]
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4).apply {
                        left = TreeNode(5)
                        right = TreeNode(5)
                    }
                    right = TreeNode(4)
                }
                right = TreeNode(3).apply {
                    left = TreeNode(4)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                    right = TreeNode(4)
                }
                right = TreeNode(3)
            }
        }
        assertThat(p.isBalanced(root), `is`(true))
    }

}
