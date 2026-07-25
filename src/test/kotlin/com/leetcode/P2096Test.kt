package com.leetcode

import com.leetcode.P2096.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2096Test {
    private val sut = P2096()

    @Test
    fun `example 1`() {
        // [5,1,2,3,null,6,4]
        val root = TreeNode(5).apply {
            left = TreeNode(1).apply {
                left = TreeNode(3)
            }
            right = TreeNode(2).apply {
                left = TreeNode(6)
                right = TreeNode(4)
            }
        }
        assertThat(sut.getDirections(root, 3, 6), `is`("UURL"))
    }

    @Test
    fun `example 2`() {
        // [2,1]
        val root = TreeNode(2).apply {
            left = TreeNode(1)
        }
        assertThat(sut.getDirections(root, 2, 1), `is`("L"))
    }
}
