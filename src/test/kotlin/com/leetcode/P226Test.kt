package com.leetcode

import com.leetcode.P226.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P226Test {
    val p = P226()

    @Test
    fun `example 01`() {
        val root = TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(7).apply {
                left = TreeNode(6)
                right = TreeNode(9)
            }
        }

        val inverted = p.invertTree(root)

        assertThat(inverted?.`val`, `is`(4))
        assertThat(inverted?.left?.`val`, `is`(7))
        assertThat(inverted?.right?.`val`, `is`(2))
        assertThat(inverted?.left?.left?.`val`, `is`(9))
        assertThat(inverted?.left?.right?.`val`, `is`(6))
        assertThat(inverted?.right?.left?.`val`, `is`(3))
        assertThat(inverted?.right?.right?.`val`, `is`(1))
    }
}
