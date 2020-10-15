package com.leetcode

import com.leetcode.P872.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P872Test {
    val p = P872()

    @Test
    fun `example 01`() {
        val root1 = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(9)
                right = TreeNode(8)
            }
        }
        val root2 = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(7)
            }
            right = TreeNode(1).apply {
                left = TreeNode(4)
                right = TreeNode(2).apply {
                    left = TreeNode(9)
                    right = TreeNode(8)
                }
            }
        }

        assertThat(p.leafSimilar(root1, root2), `is`(true));
    }

    @Test
    fun `example 02`() {
        val root1 = TreeNode(1)
        val root2 = TreeNode(1)
        assertThat(p.leafSimilar(root1, root2), `is`(true));
    }

    @Test
    fun `example 03`() {
        val root1 = TreeNode(1)
        val root2 = TreeNode(2)
        assertThat(p.leafSimilar(root1, root2), `is`(false));
    }

    @Test
    fun `example 04`() {
        val root1 = TreeNode(1).apply { left = TreeNode(2) }
        val root2 = TreeNode(2).apply { left = TreeNode(2) }
        assertThat(p.leafSimilar(root1, root2), `is`(true));
    }

    @Test
    fun `example 05`() {
        val root1 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        val root2 = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(2)
        }
        assertThat(p.leafSimilar(root1, root2), `is`(false));
    }

    @Test
    fun `example 06`() {
        val root1 = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(7)
            }
            right = TreeNode(1).apply {
                left = TreeNode(4)
                right = TreeNode(2).apply {
                    left = TreeNode(9)
                    right = TreeNode(11).apply {
                        left = TreeNode(8)
                        right = TreeNode(10)
                    }
                }
            }
        }
        val root2 = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(9)
                right = TreeNode(8)
            }
        }
        assertThat(p.leafSimilar(root1, root2), `is`(false));
    }

}
