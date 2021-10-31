package com.leetcode

import com.leetcode.P129.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P129Test {
    val p = P129()

    @Test
    fun `example 01`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        assertThat(p.sumNumbers(root), `is`(25))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(4).apply {
            left = TreeNode(9).apply {
                left = TreeNode(5)
                right = TreeNode(1)
            }
            right = TreeNode(0)
        }
        assertThat(p.sumNumbers(root), `is`(1026))
    }

}
