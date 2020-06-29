package com.leetcode

import com.leetcode.P1302.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1302Test {
    val p = P1302()

    @Test
    fun `example 01`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4).apply {
                    left = TreeNode(7)
                }
                right = TreeNode(5)
            }
            right = TreeNode(3).apply {
                right = TreeNode(6).apply {
                    right = TreeNode(8)
                }
            }
        }

        assertThat(p.deepestLeavesSum(root), `is`(15))

    }
}
