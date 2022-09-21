package com.leetcode

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
class P111 {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val queue = mutableListOf<TreeNode>()
        queue += root

        var depth = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val poll = queue.removeAt(0)
                if (poll.left == null && poll.right == null) {
                    return depth
                }
                poll.left?.run { queue += this }
                poll.right?.run { queue += this }
            }
            depth++
        }
        return depth
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
