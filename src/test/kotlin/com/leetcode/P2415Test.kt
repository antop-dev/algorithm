package com.leetcode

import com.leetcode.P2415.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import java.util.*

class P2415Test {
    val sut = P2415()

    @Test
    fun `example 1`() {
        val root = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(8)
                right = TreeNode(13)
            }
            right = TreeNode(5).apply {
                left = TreeNode(21)
                right = TreeNode(34)
            }
        }
        val ans = sut.reverseOddLevels(root)
        assertThat(
            toList(ans),
            `is`(listOf(2, 5, 3, 8, 13, 21, 34))
        )
    }

    @Test
    fun `example 2`() {
        val root = TreeNode(7).apply {
            left = TreeNode(13)
            right = TreeNode(11)
        }
        val ans = sut.reverseOddLevels(root)
        assertThat(
            toList(ans),
            `is`(listOf(7, 11, 13))
        )
    }

    @Test
    fun `example 3`() {
        val root = TreeNode(0).apply {
            left = TreeNode(1).apply {
                left = TreeNode(0).apply {
                    left = TreeNode(1)
                    right = TreeNode(1)
                }
                right = TreeNode(0).apply {
                    left = TreeNode(1)
                    right = TreeNode(1)
                }
            }
            right = TreeNode(2).apply {
                left = TreeNode(0).apply {
                    left = TreeNode(2)
                    right = TreeNode(2)
                }
                right = TreeNode(0).apply {
                    left = TreeNode(2)
                    right = TreeNode(2)
                }
            }
        }
        val ans = sut.reverseOddLevels(root)
        assertThat(
            toList(ans),
            `is`(listOf(0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1))
        )
    }

    @Test
    fun `example 4`() {
        val root = null
        val ans = sut.reverseOddLevels(root)
        assertThat(toList(ans), `is`(listOf()))
    }

    @Test
    fun `example 5`() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4).apply {
                    left = TreeNode(8)
                    right = TreeNode(9)
                }
                right = TreeNode(5).apply {
                    left = TreeNode(10)
                    right = TreeNode(11)
                }
            }
            right = TreeNode(3).apply {
                left = TreeNode(6).apply {
                    left = TreeNode(12)
                    right = TreeNode(13)
                }
                right = TreeNode(7).apply {
                    left = TreeNode(14)
                    right = TreeNode(15)
                }
            }
        }
        val ans = sut.reverseOddLevels(root)
        assertThat(
            toList(ans),
            `is`(listOf(1, 3, 2, 4, 5, 6, 7, 15, 14, 13, 12, 11, 10, 9, 8))
        )
    }

    private fun toList(root: TreeNode?): List<Int> {
        if (root == null) {
            return listOf()
        }

        val list = mutableListOf<Int>()
        val queue = LinkedList<TreeNode>()
        queue += root

        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val poll = queue.poll()
                list += poll.`val`
                poll.left?.let { queue += it }
                poll.right?.let { queue += it }
            }
        }
        return list
    }
}
