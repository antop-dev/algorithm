package com.leetcode

// https://leetcode.com/problems/search-in-a-binary-search-tree/
class P700 {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var node = root
        while (node != null) {
            node = when {
                `val` < node.`val` -> node.left
                `val` > node.`val` -> node.right
                else -> return node
            }
        }
        return null
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}