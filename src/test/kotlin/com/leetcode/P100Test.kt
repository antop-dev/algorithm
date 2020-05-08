package com.leetcode

import com.leetcode.P100.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P100Test {
    val p = P100()

    @Test
    fun `example 1`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        val q = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        assertThat(this.p.isSameTree(p, q), `is`(true))
    }

    @Test
    fun `example 2`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
        }
        val q = TreeNode(1).apply {
            right = TreeNode(2)
        }
        assertThat(this.p.isSameTree(p, q), `is`(false))
    }

    @Test
    fun `example 3`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(1)
        }
        val q = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(2)
        }
        assertThat(this.p.isSameTree(p, q), `is`(false))
    }

}