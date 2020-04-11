package com.leetcode

import com.leetcode.P653B.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
internal class P653BTest {
    val p = P653B()

    @Test
    fun `example 1`() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2)
                right = TreeNode(4)
            }
            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }
        assertEquals(true, p.findTarget(root, 9))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2)
                right = TreeNode(4)
            }
            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }
        assertEquals(false, p.findTarget(root, 28))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(1)
        assertEquals(false, p.findTarget(root, 2))
    }

    @Test
    fun `example 4`() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertEquals(true, p.findTarget(root, 4))
    }

    @Test
    fun `example 5`() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertEquals(true, p.findTarget(root, 3))
    }

    @Test
    fun `example 6`() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertEquals(false, p.findTarget(root, 1))
    }

    @Test
    fun `example 7`() {
        val root = TreeNode(2).apply {
            left = TreeNode(0).apply {
                left = TreeNode(-4)
                right = TreeNode(1)
            }
            right = TreeNode(3)
        }
        assertEquals(true, p.findTarget(root, -1))
    }

    @Test
    fun `example 8`() {
        val root = TreeNode(1).apply {
            left = TreeNode(0).apply {
                left = TreeNode(-2)
            }
            right = TreeNode(4).apply {
                left = TreeNode(3)
            }
        }
        assertEquals(true, p.findTarget(root, 7))
    }

    @Test
    fun `example 9`() {
        val root = TreeNode(334).apply {
            left = TreeNode(227).apply {
                right = TreeNode(285)
            }
            right = TreeNode(507).apply {
                right = TreeNode(678)
            }
        }
        assertEquals(false, p.findTarget(root, 1014))
    }
}