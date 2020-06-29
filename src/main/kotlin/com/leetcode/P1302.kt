package com.leetcode

// https://leetcode.com/problems/deepest-leaves-sum/
class P1302 {
    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) return 0
        // [최대 깊이, 최대 깊이의 합]
        return with(arrayOf(0, 1)) {
            dfs(this, root, 1)
            this[1]
        }
    }

    private fun dfs(v: Array<Int>, root: TreeNode, depth: Int) {
        if (root.left == null && root.right == null) { // leaf
            if (depth > v[0]) {
                v[0] = depth
                v[1] = root.`val`
            } else if (depth == v[0]) {
                v[1] += root.`val`
            }
        }
        root.left?.run { dfs(v, this, depth + 1) }
        root.right?.run { dfs(v, this, depth + 1) }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
