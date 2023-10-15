package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/513
class P103 {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        if (root == null) return ans

        var odd = true
        val queue = LinkedList<TreeNode>().apply { this += root }
        while (queue.isNotEmpty()) {
            val list = mutableListOf<Int>()
            val size = queue.size
            repeat(size) {
                val node = queue.poll()
                list += node.`val`
                node.left?.run { queue += this }
                node.right?.run { queue += this }
            }
            ans += if (odd) list else list.reversed()
            odd = !odd
        }
        return ans
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
        override fun toString() = "$`val`"
    }
}
