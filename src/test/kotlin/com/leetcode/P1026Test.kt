package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import com.leetcode.P1026.TreeNode

class P1026Test {
    val sut = P1026()

    @Test
    fun `example 1`() {
        val root = TreeNode(8).apply {
            left = TreeNode(3).apply {
                left = TreeNode(1)
                right = TreeNode(6).apply {
                    left = TreeNode(4)
                    right = TreeNode(7)
                }
            }
            right = TreeNode(10).apply {
                right = TreeNode(14).apply {
                    left = TreeNode(13)
                }
            }
        }
        assertThat(sut.maxAncestorDiff(root), `is`(7))
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                right = TreeNode(0).apply {
                    left = TreeNode(3)
                }
            }
        }
        assertThat(sut.maxAncestorDiff(root), `is`(3))
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(7).apply {
            left = TreeNode(5).apply {
                left = TreeNode(11).apply {
                    left = TreeNode(4).apply {
                        left = TreeNode(18)
                    }
                    right = TreeNode(17)
                }
                right = TreeNode(0).apply {
                    left = TreeNode(6).apply {
                        right = TreeNode(9)
                    }
                    right = TreeNode(19).apply {
                        left = TreeNode(14)
                        right = TreeNode(10).apply {
                            left = TreeNode(3)
                            right = TreeNode(1).apply {
                                left = TreeNode(8).apply {
                                    left = TreeNode(13).apply {
                                        right = TreeNode(15)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            right = TreeNode(12).apply {
                left = TreeNode(2).apply {
                    right = TreeNode(16)
                }
            }
        }
        assertThat(sut.maxAncestorDiff(root), `is`(19))
    }
}
