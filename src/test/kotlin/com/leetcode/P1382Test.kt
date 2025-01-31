package com.leetcode

import com.leetcode.P1382.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test

class P1382Test {
    val sut = P1382()

    @Test
    fun `example 1`() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                right = TreeNode(3).apply {
                    right = TreeNode(4)
                }
            }
        }
        val ans = sut.balanceBST(root)
        assertThat(ans, notNullValue())
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }
        val ans = sut.balanceBST(root)
        assertThat(ans, notNullValue())
        assertThat(ans?.`val`, `is`(2))
        assertThat(ans?.left?.`val`, `is`(1))
        assertThat(ans?.right?.`val`, `is`(3))
    }

    @Test
    fun `example 3`() {
        val root = null
        val ans = sut.balanceBST(root)
        assertThat(ans, nullValue())
    }

}
