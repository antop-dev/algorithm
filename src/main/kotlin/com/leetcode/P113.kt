package com.leetcode

// https://leetcode.com/problems/path-sum-ii/
class P113 {

    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        val paths = mutableListOf<List<Int>>()
        dfs(root, targetSum, mutableListOf(), paths)
        return paths
    }

    private fun dfs(node: TreeNode?, targetSum: Int, path: MutableList<Int>, paths: MutableList<List<Int>>) {
        if (node == null) return
        path += node.`val`
        if (node.left == null && node.right == null && node.`val` == targetSum) {
            paths += path.toList()
        }
        dfs(node.left, targetSum - node.`val`, path, paths)
        dfs(node.right, targetSum - node.`val`, path, paths)
        // backtracking
        path.removeAt(path.lastIndex)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
