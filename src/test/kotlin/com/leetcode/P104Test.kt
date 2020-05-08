package com.leetcode

import com.leetcode.P104.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P104Test {
    val p = P104()

    @Test
    fun `example`() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        assertThat(p.maxDepth(root), `is`(3))
    }
}
