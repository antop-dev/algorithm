package com.leetcode

// https://leetcode.com/problems/invert-binary-tree/
class P226 {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val tmp = invertTree(root.right)
        root.right = invertTree(root.left)
        root.left = tmp
        return root
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
