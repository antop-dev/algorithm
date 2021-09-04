package com.leetcode

// https://leetcode.com/problems/binary-tree-right-side-view/
class P199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        dfs(root, list, 0)
        return list
    }

    private fun dfs(root: TreeNode?, list: MutableList<Int>, i: Int) {
        if (root == null) return
        if (list.size == i) list += root.`val`
        dfs(root.right, list, i + 1)
        dfs(root.left, list, i + 1)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
