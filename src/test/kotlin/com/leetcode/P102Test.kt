package com.leetcode

import com.leetcode.P102.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P102Test {
    val p = P102()

    @Test
    fun example() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))
        assertThat(p.levelOrder(root), `is`(expected))
    }
}
