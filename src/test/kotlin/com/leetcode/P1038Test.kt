package com.leetcode

import com.leetcode.P1038.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1038Test {
    val sut = P1038()

    @Test
    fun `example 1`() {
        val root = TreeNode(4).apply {
            left = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(2).apply {
                    right = TreeNode(3)
                }
            }
            right = TreeNode(6).apply {
                left = TreeNode(5)
                right = TreeNode(7).apply {
                    right = TreeNode(8)
                }
            }
        }
        sut.bstToGst(root)
        assertThat(root?.`val`, `is`(30))
    }
}
