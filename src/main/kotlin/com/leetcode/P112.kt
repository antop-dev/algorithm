package com.leetcode

// https://leetcode.com/problems/path-sum/
class P112 {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        return root?.run { dps(root, sum) } ?: false
    }

    private fun dps(node: TreeNode?, sum: Int, hap: Int = 0): Boolean {
        return node?.run {
            with(hap + this.`val`) {
                if (left == null && right == null) this == sum
                else dps(left, sum, this) || dps(right, sum, this)
            }
        } ?: false
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
