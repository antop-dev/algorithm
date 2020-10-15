package com.leetcode

class P872 {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val stack1 = mutableListOf(root1)
        val stack2 = mutableListOf(root2)
        while (stack1.isNotEmpty() || stack2.isNotEmpty()) {
            if (dfs(stack1)?.`val` != dfs(stack2)?.`val`) return false
        }
        return true
    }

    private fun dfs(stack: MutableList<TreeNode?>): TreeNode? {
        while (stack.isNotEmpty()) {
            with(stack.removeAt(0)!!) {
                if (left == null && right == null) return this
                if (right != null) stack.add(0, right)
                if (left != null) stack.add(0, left)
            }
        }
        return null
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        override fun toString() = "$`val`"
    }
}
