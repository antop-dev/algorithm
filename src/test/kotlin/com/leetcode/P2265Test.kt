package com.leetcode

import com.leetcode.P2265.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2265Test {
    val sut = P2265()

    @Test
    fun `example 1`() {
        val root = TreeNode(4).apply {
            left = TreeNode(8).apply {
                left = TreeNode(0)
                right = TreeNode(1)
            }
            right = TreeNode(5).apply {
                right = TreeNode(6)
            }
        }
        assertThat(sut.averageOfSubtree(root), `is`(5))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1)
        assertThat(sut.averageOfSubtree(root), `is`(1))
    }

}
