package com.leetcode

import com.leetcode.P107.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P107Test {
    val p = P107()

    @Test
    fun levelOrderBottom() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val expected = listOf(listOf(15, 7), listOf(9, 20), listOf(3))
        assertThat(p.levelOrderBottom(root), `is`(expected))
    }

}
