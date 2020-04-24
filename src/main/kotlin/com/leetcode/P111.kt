package com.leetcode

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
class P111 {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = mutableListOf<TreeNode>().apply { add(root) }
        var depth = 1
        run loop@{
            while (queue.isNotEmpty()) {
                var size = queue.size
                while (size > 0) {
                    with(queue.removeAt(0)) {
                        if (left == null && right == null) return@loop
                        left?.run { queue.add(this) }
                        right?.run { queue.add(this) }
                    }
                    size--
                }
                depth++
            }
        }
        return depth
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}