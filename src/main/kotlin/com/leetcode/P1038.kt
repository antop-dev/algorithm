package com.leetcode

// https://github.com/antop-dev/algorithm/issues/576
class P1038 {

    fun bstToGst(root: TreeNode?): TreeNode? {
        dfs(root, 0)
        return root
    }

    private fun dfs(root: TreeNode?, down: Int): Int {
        if (root == null) return down

        // right
        val right = dfs(root.right, down)
        // self
        root.`val` += right
        // left
        val left = dfs(root.left, root.`val`)

        return left
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
