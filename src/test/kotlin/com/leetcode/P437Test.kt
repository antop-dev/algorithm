package com.leetcode

import com.leetcode.P437.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P437Test {
    private val sut = P437()

    @Test
    fun `example 1`() {
        // [10,5,-3,3,2,null,11,3,-2,null,1]
        val root = TreeNode(10).apply {
            left = TreeNode(5).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(3)
                    right = TreeNode(-2)
                }
                right = TreeNode(2).apply {
                    right = TreeNode(1)
                }
            }
            right = TreeNode(-3).apply {
                right = TreeNode(11)
            }
        }
        assertThat(sut.pathSum(root, 8), `is`(3))
    }

    @Test
    fun `example 2`() {
        // [5,4,8,11,null,13,4,7,2,null,null,5,1]
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
                    left = TreeNode(5)
                    right = TreeNode(1)
                }
            }
        }
        assertThat(sut.pathSum(root, 22), `is`(3))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(5).apply {
            left = TreeNode(1000000000).apply {
                left = TreeNode(1000000000).apply {
                    left = TreeNode(294967296).apply {
                        left = TreeNode(1000000000).apply {
                            left = TreeNode(1000000000).apply {
                                left = TreeNode(1000000000)
                            }
                        }
                    }
                }
            }
        }
        assertThat(sut.pathSum(root, 0), `is`(0))
    }
}
