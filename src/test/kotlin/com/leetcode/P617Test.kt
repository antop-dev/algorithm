package com.leetcode

import com.leetcode.P617.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P617Test {
    val p = P617()

    @Test
    fun `example 01`() {
        val t1 = TreeNode(1).apply {
            left = TreeNode(3).apply {
                left = TreeNode(5)
            }
            right = TreeNode(2)
        }
        val t2 = TreeNode(2).apply {
            left = TreeNode(1).apply {
                right = TreeNode(4)
            }
            right = TreeNode(3).apply {
                right = TreeNode(7)
            }
        }

        val s = p.mergeTrees(t1, t2)
        assertThat(s?.`val`, `is`(3))
        assertThat(s?.left?.`val`, `is`(4))
        assertThat(s?.right?.`val`, `is`(5))
        assertThat(s?.left?.left?.`val`, `is`(5))
        assertThat(s?.left?.right?.`val`, `is`(4))
        assertThat(s?.right?.right?.`val`, `is`(7))
    }
}
