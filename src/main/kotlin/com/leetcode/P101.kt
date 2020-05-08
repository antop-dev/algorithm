package com.leetcode

// https://leetcode.com/problems/symmetric-tree/
class P101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        return when (root) {
            null -> true
            else -> dps(root.left, root.right)
        }
    }

    private fun dps(left: TreeNode?, right: TreeNode?): Boolean {
        return when {
            left == null && right == null -> true
            left?.`val` != right?.`val` -> false
            else -> dps(left?.left, right?.right) && dps(left?.right, right?.left)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
