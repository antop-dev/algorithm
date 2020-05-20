package kr.co.programmers

import com.leetcode.P112
import com.leetcode.P112.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P112Test {
    val p = P112()

    @Test
    fun `example 1`() {
        val root = TreeNode(5).apply {
            left = TreeNode(4).apply {
                left = TreeNode(11).apply {
                    left = TreeNode(7)
                    right = TreeNode(2)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(13)
                right = TreeNode(4).apply {
                    right = TreeNode(1)
                }
            }
        }

        assertThat(p.hasPathSum(root, 22), `is`(true))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            left = TreeNode(-2).apply {
                left = TreeNode(1).apply {
                    left = TreeNode(-1)
                }
                right = TreeNode(3)
            }
            right = TreeNode(-3).apply {
                left = TreeNode(-2)
            }
        }

        assertThat(p.hasPathSum(root, 2), `is`(true))
        assertThat(p.hasPathSum(root, -1), `is`(true))
    }

    @Test
    fun `example 3`() {
        val root = null
        assertThat(p.hasPathSum(root, 0), `is`(false))
    }

    @Test
    fun `example 4`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
        }
        assertThat(p.hasPathSum(root, 1), `is`(false))
    }

}
