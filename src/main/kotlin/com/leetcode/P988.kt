package com.leetcode

import java.util.TreeSet

// https://github.com/antop-dev/algorithm/issues/691
class P988 {
    fun smallestFromLeaf(root: TreeNode?): String {
        val pool = TreeSet<String>()
        val sb = StringBuilder()
        dfs(root, pool, sb).toString()
        return pool.first()
    }

    private fun dfs(node: TreeNode?, pool: TreeSet<String>, sb: StringBuilder) {
        if (node == null) {
            return
        }

        sb.insert(0, 'a' + node.`val`)

        if (node.left == null && node.right == null) { // leaf
            pool += sb.toString()
        } else {
            dfs(node.left, pool, sb)
            dfs(node.right, pool, sb)
        }

        sb.deleteAt(0) // backtracking
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}