package com.leetcode

import com.leetcode.P114.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P114Test {
    val sut = P114()

    @Test
    fun `example 1`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(5).apply {
                right = TreeNode(6)
            }
        }
        sut.flatten(root)
        verify(root, 1, 2, 3, 4, 5, 6)
    }

    @Test
    fun `example 2`() {
        val root = null
        sut.flatten(root)
        verify(root)
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(0)
        sut.flatten(root)
        verify(root, 0)
    }

    private fun verify(root: TreeNode?, vararg ans: Int) {
        var i = 0
        var node: TreeNode? = root
        while (node != null) {
            assertThat(node.`val`, `is`(ans[i]))
            node = node.right
            i++
        }
        assertThat(i, `is`(ans.size))
    }
}
