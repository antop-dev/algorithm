package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/306
class P1315 {
    fun sumEvenGrandparent(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = LinkedList<TreeNode>().apply {
            this += root
        }

        var sum = 0
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            if (node.`val` % 2 == 0) { // odd
                sum += node?.left?.left?.`val` ?: 0
                sum += node?.left?.right?.`val` ?: 0
                sum += node?.right?.left?.`val` ?: 0
                sum += node?.right?.right?.`val` ?: 0
            }
            node.left?.run { queue += this }
            node.right?.run { queue += this }
        }

        return sum
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
