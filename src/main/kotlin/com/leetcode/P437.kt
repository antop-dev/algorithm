package com.leetcode

// https://github.com/antop-dev/algorithm/issues/769
class P437 {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        if (root == null) return 0
        return dfs(root, targetSum.toLong()) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum)
    }

    private fun dfs(node: TreeNode?, targetSum: Long): Int {
        if (node == null) return 0
        return (if (node.`val`.toLong() == targetSum) 1 else 0) +
                dfs(node.left, targetSum - node.`val`) +
                dfs(node.right, targetSum - node.`val`)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
