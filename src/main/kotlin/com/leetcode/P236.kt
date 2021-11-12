package com.leetcode

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class P236 {
    var answer: TreeNode? = null

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        dfs(root, p!!, q!!)
        return answer
    }

    private fun dfs(node: TreeNode?, p: TreeNode, q: TreeNode): Boolean {
        if (node == null) return false
        val l = if (dfs(node.left, p, q)) 1 else 0
        val r = if (dfs(node.right, p, q)) 1 else 0
        val m = if (node == p || node == q) 1 else 0
        if (m + l + r >= 2) answer = node
        return m + l + r > 0
    }

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
