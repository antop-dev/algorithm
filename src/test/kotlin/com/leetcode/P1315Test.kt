package com.leetcode

import com.leetcode.P1315.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1315Test {
    val p = P1315()

    @Test
    fun `example 01`() {
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

        assertThat(p.sumEvenGrandparent(root), `is`(18))
    }

    @Test
    fun `example 02`() {
        val root = TreeNode(61).apply {
            left = TreeNode(13)
            right = TreeNode(46).apply {
                right = TreeNode(56).apply {
                    left = TreeNode(72)
                }
            }
        }

        assertThat(p.sumEvenGrandparent(root), `is`(72))
    }
}
