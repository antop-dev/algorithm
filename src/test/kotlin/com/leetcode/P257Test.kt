package com.leetcode

import com.leetcode.P257.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P257Test {
    val p = P257()

    @Test
    fun `example 01`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(5)
            }
            right = TreeNode(3)
        }
        assertThat(p.binaryTreePaths(root), `is`(listOf("1->2->5", "1->3")))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(1)
        assertThat(p.binaryTreePaths(root), `is`(listOf("1")))
    }

}
