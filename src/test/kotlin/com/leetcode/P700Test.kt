package com.leetcode

import com.leetcode.P700.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/search-in-a-binary-search-tree/
internal class P700Test {
    val p = P700()

    @Test
    fun `example`() {
        val root = TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(7)
        }

        val find = p.searchBST(root, 2)

        assertNotNull(find)
        assertEquals(2, find?.`val`)
        assertEquals(1, find?.left?.`val`)
        assertEquals(3, find?.right?.`val`)
    }
}