package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/627
class P2415 {
    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        val queue = LinkedList<TreeNode>()
        root?.let { queue.offer(it) }

        var level = 0
        val list = mutableListOf<TreeNode>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val node = queue.poll()
                node.left?.let { queue += it }
                node.right?.let { queue += it }
                list += node
            }
            if (level % 2 != 0) { // odd level
                reverse(list)
            }

            level++
            list.clear()
        }
        return root
    }

    private fun reverse(list: List<TreeNode>) {
        for (i in 0 until list.size / 2) {
            val a = list[i]
            val b = list[list.lastIndex - i]
            // swap
            val temp = a.`val`
            a.`val` = b.`val`
            b.`val` = temp
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
