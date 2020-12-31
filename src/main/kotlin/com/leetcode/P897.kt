package com.leetcode

// https://leetcode.com/problems/increasing-order-search-tree/
class P897 {
    fun increasingBST(root: TreeNode?): TreeNode? {
        return mutableListOf<TreeNode>().run {
            dfs(this, root)
            for (i in 1 until size) {
                this[i - 1].right = this[i]
            }
            // debug
            // for (node in this) println("node = ${node.`val`}, left=${node.left?.`val`}, right=${node.right?.`val`}")
            this[0]
        }
    }

    private fun dfs(ordered: MutableList<TreeNode>, node: TreeNode?) {
        node?.run {
            dfs(ordered, left)
            ordered += this
            dfs(ordered, right)
            left = null
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
