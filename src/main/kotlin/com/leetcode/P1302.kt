package com.leetcode

// https://github.com/antop-dev/algorithm/issues/755
class P1302 {
    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        var ans = 0
        val queue = LinkedList<TreeNode>()
        queue += root

        while (queue.isNotEmpty()) {
            var sum = 0
            repeat(queue.size) {
                val node = queue.poll()
                sum += node.`val`
                node.left?.let { queue += it }
                node.right?.let { queue += it }
            }

            ans = sum
        }

        return ans
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
