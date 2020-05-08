package com.leetcode

import kotlin.math.max

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
class P104 {
    fun maxDepth(root: TreeNode?): Int {
        return if (root == null) 0 else dps(root, 0)
    }

    private fun dps(node: TreeNode?, depth: Int): Int {
        return if (node == null) depth
        else max(dps(node.left, depth + 1), dps(node.right, depth + 1))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
