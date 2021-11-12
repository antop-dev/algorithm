package com.leetcode

import com.leetcode.P236.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P236Test {
    val p = P236()

    @Test
    fun `example 01`() {
        val p = TreeNode(5)
        val q = TreeNode(1)
        val root = TreeNode(3).apply {
            left = p.apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = q.apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        assertThat(this.p.lowestCommonAncestor(root, p, q), `is`(root))
    }

    @Test
    fun `example 02`() {
        val p = TreeNode(5)
        val q = TreeNode(4)
        val root = TreeNode(3).apply {
            left = p.apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = q
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        assertThat(this.p.lowestCommonAncestor(root, p, q), `is`(p))
    }
}
