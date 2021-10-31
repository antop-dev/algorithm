package com.leetcode

// https://github.com/antop-dev/algorithm/issues/345
class P129 {

    fun sumNumbers(root: TreeNode?, sum: Int = 0): Int {
        return dfs(root, 0)
    }

    private fun dfs(root: TreeNode?, sum: Int): Int {
        if (root == null) return 0
        val x = (sum * 10) + root.`val`
        return if (root.left == null && root.right == null) x
        else dfs(root.left, x) + dfs(root.right, x)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
