package com.leetcode

import com.leetcode.P637.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P637Test {
    val p = P637()

    @Test
    fun `example 1`() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        assertThat(p.averageOfLevels(root), `is`(doubleArrayOf(3.0, 14.5, 11.0)))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(2147483647).apply {
            left = TreeNode(2147483647)
            right = TreeNode(2147483647)
        }

        assertThat(p.averageOfLevels(root), `is`(doubleArrayOf(2147483647.0, 2147483647.0)))
    }
}
