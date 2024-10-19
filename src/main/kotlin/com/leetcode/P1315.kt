package com.leetcode

// https://github.com/antop-dev/algorithm/issues/306
class P1315 {
    fun sumEvenGrandparent(root: TreeNode?): Int {
        return dfs(root, null, null)
    }

    private fun dfs(node: TreeNode?, p: TreeNode?, gp: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        var sum = 0
        gp?.let {
            if (it.`val` % 2 == 0) {
                sum += node.`val`
            }
        }
        sum += dfs(node.left, node, p)
        sum += dfs(node.right, node, p)

        return sum
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
