package com.leetcode

// https://leetcode.com/problems/merge-two-binary-trees/
class P617 {

    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        // dfs
        return when {
            t1 == null -> t2
            t2 == null -> t1
            else -> {
                val t = TreeNode(t1.`val` + t2.`val`)
                t.left = mergeTrees(t1.left, t2.left)
                t.right = mergeTrees(t1.right, t2.right)
                t
            }
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
