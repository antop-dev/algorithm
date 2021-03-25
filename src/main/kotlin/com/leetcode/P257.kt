package com.leetcode

// https://leetcode.com/problems/binary-tree-paths/
class P257 {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        val paths = mutableListOf<String>()
        dfs(root, "", paths)
        return paths
    }

    private fun dfs(node: TreeNode?, path: String, paths: MutableList<String>) {
        if (node == null) return
        val p = if (path == "") "${node.`val`}" else "$path->${node.`val`}"
        if (node.left == null && node.right == null) {
            paths += p
        } else {
            dfs(node.left, p, paths)
            dfs(node.right, p, paths)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
