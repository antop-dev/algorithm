package com.leetcode

import com.leetcode.P1022.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
internal class P1022Test {
    val p = P1022()

    @Test
    fun `example 1`() {
        val root = TreeNode(1).apply {
            left = TreeNode(0).apply {
                left = TreeNode(0)
                right = TreeNode(1)
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(1)
            }
        }

        assertEquals(22, p.sumRootToLeaf(root))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            left = TreeNode(0).apply {
                right = TreeNode(1)
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
            }
        }

        assertEquals(11, p.sumRootToLeaf(root))
    }
}