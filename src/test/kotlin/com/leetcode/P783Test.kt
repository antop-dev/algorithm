package com.leetcode

import com.leetcode.P783.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
internal class P783Test {
    val p = P783()

    @Test
    fun `example 1`() {
        val root = TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(6)
        }
        assertEquals(1, p.minDiffInBST(root))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(90).apply {
            left = TreeNode(69).apply {
                left = TreeNode(49).apply {
                    right = TreeNode(52)
                }
                right = TreeNode(89)
            }
        }
        assertEquals(1, p.minDiffInBST(root))
    }
}