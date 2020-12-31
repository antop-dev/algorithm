package com.leetcode

import com.leetcode.P897.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P897Test {
    val p = P897()

    @Test
    fun `example 01`() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                }
                right = TreeNode(4)
            }
            right = TreeNode(6).apply {
                right = TreeNode(8).apply {
                    left = TreeNode(7)
                    right = TreeNode(9)
                }
            }
        }

        val answer = p.increasingBST(root)

        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.right?.`val`, `is`(2))
        assertThat(answer?.right?.right?.`val`, `is`(3))
        assertThat(answer?.right?.right?.right?.`val`, `is`(4))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(5).apply {
            left = TreeNode(1)
            right = TreeNode(7)
        }

        val answer = p.increasingBST(root)

        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.right?.`val`, `is`(5))
        assertThat(answer?.right?.right?.`val`, `is`(7))
    }

    @Test
    fun `example 03`() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(4).apply {
                left = TreeNode(3)
            }
        }

        val answer = p.increasingBST(root)

        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.left, nullValue())
        assertThat(answer?.right?.`val`, `is`(2))
        assertThat(answer?.right?.left, nullValue())
        assertThat(answer?.right?.right?.`val`, `is`(3))
        assertThat(answer?.right?.right?.left, nullValue())
        assertThat(answer?.right?.right?.right?.`val`, `is`(4))
        assertThat(answer?.right?.right?.right?.left, nullValue())
    }
}
