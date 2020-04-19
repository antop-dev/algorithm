package com.leetcode

import com.leetcode.P235.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P235Test {
    val p = P235()

    val root = TreeNode(6).apply {
        left = TreeNode(2).apply {
            left = TreeNode(0)
            right = TreeNode(4).apply {
                left = TreeNode(3)
                right = TreeNode(5)
            }
        }
        right = TreeNode(8).apply {
            left = TreeNode(7)
            right = TreeNode(9)
        }
    }

    @Test
    fun `example 1`() {
        val lca = p.lowestCommonAncestor(root, TreeNode(2), TreeNode(8));
        assertEquals(6, lca?.`val`)
    }

    @Test
    fun `example 2`() {
        val lca = p.lowestCommonAncestor(root, TreeNode(2), TreeNode(4))
        assertEquals(2, lca?.`val`)
    }

    @Test
    fun `example 3`() {
        val lca = p.lowestCommonAncestor(root, TreeNode(0), TreeNode(5))
        assertEquals(2, lca?.`val`)
    }

}