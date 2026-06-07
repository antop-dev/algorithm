package com.leetcode

import com.leetcode.P1302.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1302Test {
    val sut = P1302()

    @Test
    fun `example 1`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4).apply {
                    left = TreeNode(7)
                }
                right = TreeNode(5)
            }
            right = TreeNode(3).apply {
                right = TreeNode(6).apply {
                    right = TreeNode(8)
                }
            }
        }
        assertThat(sut.deepestLeavesSum(root), `is`(15))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(6).apply {
            left = TreeNode(7).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(9)
                }
                right = TreeNode(7).apply {
                    left = TreeNode(1)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(1)
                right = TreeNode(3).apply {
                    right = TreeNode(5)
                }
            }
        }
        assertThat(sut.deepestLeavesSum(root), `is`(19))
    }
}
